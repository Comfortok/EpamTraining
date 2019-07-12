package kz.epam.khassenov.lecture07multithreading;

public class GetStateDemo implements Runnable {
    @Override
    public void run() {
        Thread.State state = Thread.currentThread().getState();
        System.out.println(Thread.currentThread().getName() + " " + state);
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new GetStateDemo());
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        Thread.State state = thread.getState();
        System.out.println(thread.getName() + " " + state);
    }
}
