package kz.epam.khassenov.lecture07multithreading.synchronizedcollections;

public class Manager implements Runnable {
    private QueueTask pbQ;
    private String name;

    public Manager(QueueTask pbQ, String name) {
        this.pbQ = pbQ;
        this.name = name;
    }

    @Override
    public void run() {
        Task task;
        while ((task = pbQ.getTask()) != null){
            System.out.println(name + " get task number " + task.getTaskNumber());
        }
    }
}
