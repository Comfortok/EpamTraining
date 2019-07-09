package kz.epam.khassenov.practice06coffeehouse;

public class Cappucino extends Espresso{
    private Addition milk;
    private Addition wippedMilk;

    public Addition getMilk() {
        return milk;
    }

    public void setMilk(Addition milk) {
        this.milk = milk;
    }

    public Addition getWippedMilk() {
        return wippedMilk;
    }

    public void setWippedMilk(Addition wippedMilk) {
        this.wippedMilk = wippedMilk;
    }

    public Cappucino() {
    }

    public Cappucino(String name, String bean, double waterAmount,
                     double price, Addition salt, Addition sugar, Addition milk, Addition wippedMilk) {
        super(name, bean, waterAmount, price, salt, sugar);
        this.milk = milk;
        this.wippedMilk = wippedMilk;
    }

    @Override
    public String toString() {
        return super.toString() + milk.getName() + ", amount: " + milk.getAmount() + " ml. " +
                wippedMilk.getName() + ", amount: " + wippedMilk.getAmount() + " ml.";
    }
}