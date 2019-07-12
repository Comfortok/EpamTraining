package kz.epam.khassenov.lecture07multithreading;

import kz.epam.khassenov.lecture07multithreading.syncronization.Account;
import kz.epam.khassenov.lecture07multithreading.syncronization.OperatorDeposit;
import kz.epam.khassenov.lecture07multithreading.syncronization.OperatorWithdraw;

public class OperationInspector{
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(200);
        OperatorDeposit operatorDeposit = new OperatorDeposit(account);
        OperatorWithdraw operatorWithdraw = new OperatorWithdraw(account);
        operatorDeposit.start();
        operatorWithdraw.start();
        operatorDeposit.join();
        System.out.println(account.getBalance() + " after deposit.join");
        operatorWithdraw.join();
        System.out.println(account.getBalance() + " after withdraw.join");
    }
}
