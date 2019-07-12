package kz.epam.khassenov.lecture07multithreading.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThread implements Runnable {
    public int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++){
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new SimpleThread());
        executorService.execute(new SimpleThread());
        executorService.shutdown();
    }
}