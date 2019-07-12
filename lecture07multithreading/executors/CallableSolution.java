package kz.epam.khassenov.lecture07multithreading.executors;

import java.util.concurrent.*;

public class CallableSolution {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> s1 = executorService.submit(new CallableThread());
        Future<Integer> s2 = executorService.submit(new CallableThread());
        try {
            System.out.println("Starting!");
            System.out.println("Is done s1? " + s1.isDone());
            System.out.println("Is done s2? " + s2.isDone());
            System.out.println("Get s1? " + s1.get());
            System.out.println("Get s2? " + s2.get());
            System.out.println("Is done s1? " + s1.isDone());
            System.out.println("Is done s2? " + s2.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
