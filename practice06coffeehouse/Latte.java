package kz.epam.khassenov.practice06coffeehouse;

public class Latte extends Cappucino {
    public Latte() {
    }

    public Latte(String name, String bean, double waterAmount, Addition salt, Addition sugar, Addition milk, Addition wippedMilk) {
        super(name, bean, waterAmount, salt, sugar, milk, wippedMilk);
    }
}