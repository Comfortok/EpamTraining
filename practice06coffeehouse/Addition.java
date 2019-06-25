package kz.epam.khassenov.practice06coffeehouse;

public class Addition {
    private String name;
    private double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Addition() {
    }

    public Addition(String name) {
        this.name = name;
    }

    public Addition(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return name + ", amount: " + amount + " grams";
    }
}