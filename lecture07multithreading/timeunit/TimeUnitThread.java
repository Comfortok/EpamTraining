package kz.epam.khassenov.lecture07multithreading.timeunit;

import java.util.concurrent.*;

public class TimeUnitThread implements Callable<Integer> {
    public int count = 0;

    @Override
    public Integer call(){
        for (int i = 0; i < 100; i++){
            count++;
            try {
                TimeUnit.MICROSECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> s1 = executorService.submit(new TimeUnitThread());
        Future<Integer> s2 = executorService.submit(new TimeUnitThread());
        try {
            System.out.println(s1.get());
            System.out.println(s2.get());
            System.out.println(s1.isDone());
            System.out.println(s2.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}