package kz.epam.khassenov.practice06coffeehouse;

public class Coffee {
    private String name;
    private String bean;
    private double waterAmount;
    private Cup cup;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBean() {
        return bean;
    }

    public void setBean(String bean) {
        this.bean = bean;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Coffee() {
    }

    public Coffee(String name, String bean, double waterAmount, double price) {
        this.name = name;
        this.bean = bean;
        this.waterAmount = waterAmount;
        this.price = price;
    }
}