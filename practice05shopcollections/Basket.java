package kz.epam.khassenov.practice05shopcollections;

public class Basket {
    Goods goods;
    private int count;
    private double sum;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Basket() {
    }

    public Basket(Goods goods, int count) {
        this.goods = goods;
        this.count = count;
        this.sum = goods.getPrice() * count;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "goods=" + goods +
                ", count=" + count +
                ", sum=" + sum +
                '}';
    }
}