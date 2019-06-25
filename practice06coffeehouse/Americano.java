package kz.epam.khassenov.practice06coffeehouse;

public class Americano extends Espresso {
    public Americano() {
    }

    public Americano(String name, String bean, double waterAmount, Addition salt, Addition sugar) {
        super(name, bean, waterAmount, salt, sugar);
    }
}