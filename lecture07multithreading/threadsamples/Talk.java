package kz.epam.khassenov.lecture07multithreading;

public class Talk extends Thread{
    public void run(){
        for (int i = 0; i < 8; i++){
            System.out.println("Talking");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}