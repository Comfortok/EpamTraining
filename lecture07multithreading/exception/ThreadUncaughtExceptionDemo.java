package kz.epam.khassenov.lecture07multithreading;

public class ThreadUncaughtExceptionDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new SimpleThread());
        thread.setUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t + " throws exception: " + e);
                    }
                }
        );
        thread.start();
    }
}

class SimpleThread implements Runnable{

    @Override
    public void run() {
        throw new RuntimeException("It's a great exception!");
    }
}
