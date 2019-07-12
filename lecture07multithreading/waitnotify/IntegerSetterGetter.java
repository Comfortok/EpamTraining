package kz.epam.khassenov.lecture07multithreading;

import java.util.Random;

public class IntegerSetterGetter extends Thread {
    private SharedResource resource;
    private boolean run;
    private Random random = new Random();

    public IntegerSetterGetter(String name, SharedResource resource){
        super(name);
        this.resource = resource;
        run = true;
    }

    public void stopThread(){
        run = false;
    }

    @Override
    public void run() {
        int action;
        try {
            while (run){
                action = random.nextInt(1000);
                if (action % 2 == 0){
                    getIntegersFromResource();
                } else {
                    setIntegersFromResource();
                }
            }
            System.out.println("Thread " + getName() + " has ended its work.");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private void setIntegersFromResource() throws InterruptedException{
        Integer number = random.nextInt(500);
        synchronized (resource){
            resource.setElement(number);
            System.out.println("Thread " + getName() + " has written " + number);
            resource.notifyAll();
        }
    }

    private void getIntegersFromResource() throws InterruptedException{
        Integer number;
        synchronized (resource){
            System.out.println("Thread " + getName() + " wants to take a number.");
            number = resource.getElement();
            while (number == null){
                System.out.println("Thread " + getName() + " is waiting the queue's filling");
                resource.wait();
                System.out.println("Thread " + getName() + " continius its work.");
                number = resource.getElement();
            }
            System.out.println("Thread " + getName() + " has taken " + number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();
        sharedResource.setElement(1);
        IntegerSetterGetter integerSetterGetter1 = new IntegerSetterGetter("FirstThread", sharedResource);
        IntegerSetterGetter integerSetterGetter2 = new IntegerSetterGetter("SecondThread", sharedResource);
        integerSetterGetter1.start();
        integerSetterGetter2.start();
        Thread.sleep(5000);
        integerSetterGetter1.stop();
        integerSetterGetter2.stop();
    }
}