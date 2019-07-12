package kz.epam.khassenov.lecture07multithreading.atomic;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        AtomicThread atomicThread = new AtomicThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(atomicThread);
        thread1.start();
        thread2.start();
    }
}
