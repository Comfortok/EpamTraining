package kz.epam.khassenov.lecture07multithreading;

public class MyThreadTwo implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
