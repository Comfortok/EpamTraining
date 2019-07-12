package kz.epam.khassenov.lecture07multithreading.deadlock;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
            int x = balance + amount;
            balance = x;
    }

    public void withdraw(int amount){
            int x = balance - amount;
            balance = x;
    }
}
