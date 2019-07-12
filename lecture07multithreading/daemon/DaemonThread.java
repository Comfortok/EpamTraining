package kz.epam.khassenov.lecture07multithreading.daemon;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Start main thread.");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End main thread.");
    }
}
