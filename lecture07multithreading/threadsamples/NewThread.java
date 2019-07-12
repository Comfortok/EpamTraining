package kz.epam.khassenov.lecture07multithreading.threadsamples;

public class NewThread implements Runnable {
    String name;
    Thread thread;

    public NewThread(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("New Thread: " + thread);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}
