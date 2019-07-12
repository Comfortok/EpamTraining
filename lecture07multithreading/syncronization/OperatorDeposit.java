package kz.epam.khassenov.lecture07multithreading.syncronization;

import kz.epam.khassenov.lecture07multithreading.syncronization.Account;

public class OperatorDeposit extends Thread {
    private Account account;

    public OperatorDeposit(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            synchronized (account) {
                account.deposit(100);
            }
        }
    }
}
