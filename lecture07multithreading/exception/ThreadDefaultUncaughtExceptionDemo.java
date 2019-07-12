package kz.epam.khassenov.lecture07multithreading.exception;

public class ThreadDefaultUncaughtExceptionDemo {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t + " (default handler) throws exception " + e);
                    }
                }
        );

        Thread thread1 = new Thread(new MyThreadTwo());
        Thread thread2 = new Thread(new MyThreadTwo());

        thread2.setUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t + " throws exception " + e);
                    }
                }
        );
        thread1.start();
        thread2.start();
    }
}
