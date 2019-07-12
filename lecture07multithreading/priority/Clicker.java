package kz.epam.khassenov.lecture07multithreading.priority;

public class Clicker extends Thread {
    int click = 0;
    private volatile boolean running = true;

    public Clicker(){
    }

    public void run(){
        while (running){
            click++;
        }
    }

    public void stopClick(){
        running = false;
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker();
        Clicker lo = new Clicker();
        hi.setPriority(Thread.NORM_PRIORITY + 2);
        lo.setPriority(Thread.NORM_PRIORITY - 2);
        lo.start();
        hi.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        lo.stopClick();
        hi.stopClick();
        try {
            hi.join();
            lo.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted exc found.");
        }
        System.out.println("Low-priority thread: " + lo.click);
        System.out.println("High-priority thread: " + hi.click);
    }
}
