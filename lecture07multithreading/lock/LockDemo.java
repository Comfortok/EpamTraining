package kz.epam.khassenov.lecture07multithreading.lock;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable {
    public static int count;
    private static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            lock.lock();
            count++;
            lock.unlock();
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        LockDemo lockDemo1 = new LockDemo();
        LockDemo lockDemo2 = new LockDemo();
        Thread thread1 = new Thread(lockDemo1);
        Thread thread2 = new Thread(lockDemo2);
        thread1.start();
        thread2.start();
    }
}