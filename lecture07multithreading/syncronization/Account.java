package kz.epam.khassenov.lecture07multithreading.syncronization;

public class Account {
    private int balance;
    private Object lock = new Object();

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        synchronized (lock) {
            int x = balance + amount;
            balance = x;
        }
    }

    public void withdraw(int amount){
        synchronized (this) {
            int x = balance - amount;
            balance = x;
        }
    }
}
