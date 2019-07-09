package kz.epam.khassenov.practice06coffeehouse;

public class Espresso extends Coffee {
    private Addition salt;
    private Addition sugar;
    private Topping topping;

    public Addition getSalt() {
        return salt;
    }

    public void setSalt(Addition salt) {
        this.salt = salt;
    }

    public Addition getSugar() {
        return sugar;
    }

    public void setSugar(Addition sugar) {
        this.sugar = sugar;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public Espresso() {
    }

    public Espresso(String name, String bean, double waterAmount, double price, Addition salt, Addition sugar) {
        super(name, bean, waterAmount, price);
        this.salt = salt;
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return getName() + getCup().getSize() + ". Price: " + getPrice() + " KZT" + ". Beans: " + getBean() +
                ". Additions: " + topping;
    }
}