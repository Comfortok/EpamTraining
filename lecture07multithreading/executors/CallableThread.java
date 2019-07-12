package kz.epam.khassenov.lecture07multithreading.executors;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer> {
    public int count = 0;

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 1000000; i++){
            count++;
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return count;
    }
}