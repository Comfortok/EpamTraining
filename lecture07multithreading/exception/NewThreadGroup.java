package kz.epam.khassenov.lecture07multithreading.threadgroup;

public class NewThreadGroup extends ThreadGroup {
    public NewThreadGroup(String name) {
        super(name);
    }

    public NewThreadGroup(ThreadGroup parent, String name) {
        super(parent, name);
    }
    public void uncaughtException(Thread t, Throwable e){
        System.out.println(t + " has unhandled exception " + e);
    }
}

class ThreadD extends Thread {
    public ThreadD(String name, ThreadGroup group) {
        super(group, name);
    }

    @Override
    public void run() {
        throw new RuntimeException("Oy, Exception!..");
    }
}
