package kz.epam.khassenov.practice06coffeehouse;

public class Topping extends Addition{
    public Topping() {
    }

    public Topping(String name) {
        super(name);
    }

    public Topping(String name, double amount) {
        super(name, amount);
    }

    @Override
    public String toString() {
        return ". Topping: " + getName() + ". ";
    }
}