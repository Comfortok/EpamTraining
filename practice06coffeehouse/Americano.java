package kz.epam.khassenov.practice06coffeehouse;

public class Americano extends Espresso {
    public Americano() {
    }

    public Americano(String name, String bean, double waterAmount,
                     double price, Addition salt, Addition sugar) {
        super(name, bean, waterAmount, price, salt, sugar);
    }
}