package kz.epam.khassenov.lecture07multithreading.atomic;

public class MyThread implements Runnable {
    public static volatile int count;

    @Override
    public void run() {
        for (int i = 0; i < 100000000; i++){
            count++;
        }
        System.out.println("MyThread count: " + count);
    }
}
