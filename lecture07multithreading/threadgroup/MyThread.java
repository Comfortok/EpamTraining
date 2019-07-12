package kz.epam.khassenov.lecture07multithreading;

public class MyThread extends Thread {

    public MyThread(String threadName, ThreadGroup threadGroup){
        super(threadGroup, threadName);
        System.out.println("New thread: " + this);
        start();
    }

    public MyThread() {
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--){
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception in " + getName());
        }
        System.out.println(getName() + " exiting.");
    }

    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("mainGroup");
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");
        MyThread myThread1 = new MyThread("One", groupA);
        MyThread myThread2 = new MyThread("Two", groupA);
        MyThread myThread3 = new MyThread("Three", groupB);
        MyThread myThread4 = new MyThread("Four", groupB);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        groupA.list();
        groupB.list();
        mainGroup.interrupt();
    }
}
