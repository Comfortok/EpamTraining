package kz.epam.khassenov.lecture07multithreading.threadsamples;

import kz.epam.khassenov.lecture07multithreading.threadsamples.NewThread;
import kz.epam.khassenov.lecture07multithreading.threadsamples.Talk;
import kz.epam.khassenov.lecture07multithreading.threadsamples.Walk;

public class Main {
    public static void main(String[] args) {
        Talk talk = new Talk();
        Thread walk = new Thread(new Walk());
        talk.start();
        walk.start();
        Thread thread = Thread.currentThread();
        System.out.println("Current thread: " + thread);
        thread.setName("My main thread");
        thread.setPriority(10);
        System.out.println("Current thread: " + thread);
        try {
            for (int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Exception!");
        }
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");
        System.out.println("Thread One is Alive: " + ob1.thread.isAlive());
        System.out.println("Thread Two is Alive: " + ob2.thread.isAlive());
        System.out.println("Thread Three is Alive: " + ob3.thread.isAlive());
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted.");
        }
        System.out.println("Thread One is Alive: " + ob1.thread.isAlive());
        System.out.println("Thread Two is Alive: " + ob2.thread.isAlive());
        System.out.println("Thread Three is Alive: " + ob3.thread.isAlive());
        System.out.println("Main thread exiting");
    }
}
