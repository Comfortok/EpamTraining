package kz.epam.khassenov.practice06coffeehouse;

public class Latte extends Cappucino {
    public Latte() {
    }

    public Latte(String name, String bean, double waterAmount,
                 double price, Addition salt, Addition sugar, Addition milk, Addition wippedMilk) {
        super(name, bean, waterAmount, price, salt, sugar, milk, wippedMilk);
    }
}