package kz.epam.khassenov.lecture07multithreading.deadlock;

public class OperatorDemo {
    public static void main(String[] args) {
        Account account1 = new Account(200);
        Account account2 = new Account(300);
        Operator operator1 = new Operator(account1, account2);
        Operator operator2 = new Operator(account2, account1);
        operator1.start();
        operator2.start();
    }
}
