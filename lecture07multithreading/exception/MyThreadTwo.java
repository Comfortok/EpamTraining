package kz.epam.khassenov.lecture07multithreading.exception;

public class MyThreadTwo implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
