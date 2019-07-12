package kz.epam.khassenov.lecture07multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleClock extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(i + " - " + time());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String time() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh/mm/ss");
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) throws InterruptedException {
        ConsoleClock clock = new ConsoleClock();
        clock.start();
        Thread.sleep(3000);
        clock.suspend();
        Thread.sleep(3000);
        clock.resume();
    }
}