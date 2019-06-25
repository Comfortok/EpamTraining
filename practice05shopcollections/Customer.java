package kz.epam.khassenov.practice05shopcollections;

public class Customer {
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Customer() {
    }

    public Customer(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Customer ID " + ID + " ";
    }
}