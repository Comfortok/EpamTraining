package kz.epam.khassenov.lecture07multithreading.synchronizedcollections;

public class Main {
    public static void main(String[] args) {
        QueueTask pbQueue = new QueueTask();
        for (int i = 0; i < 10; i++){
            pbQueue.setTask(new Task(i));
        }

        Manager manager1 = new Manager(pbQueue, "Johnnie");
        Manager manager2 = new Manager(pbQueue, "Walker");

        Thread thread1 = new Thread(manager1);
        Thread thread2 = new Thread(manager2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
