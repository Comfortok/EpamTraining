package kz.epam.khassenov.practice05shopcollections;

public class Basket {
    Goods goods;
    private int count;

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

    public Basket() {
    }

    public Basket(Goods goods, int count) {
        this.goods = goods;
        this.count = count;
    }

    @Override
    public String toString() {
        return goods + "count: x" + count + ". ";
    }
}