package kz.epam.khassenov.lecture07multithreading.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThread implements Runnable {
    public static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 100000000; i++){
            count.getAndAdd(1);
        }
        System.out.println("Atomic count: " + count);
    }
}
