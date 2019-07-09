package kz.epam.khassenov.practice07chess;

public class Horse {
    private int xCoordinate;
    private int yCoordinate;
    private boolean isMarked;

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public boolean isMarked() {
        return isMarked;
    }

    public void setMarked(boolean marked) {
        isMarked = marked;
    }

    public Horse() {
    }

    public Horse(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Horse(int xCoordinate, int yCoordinate, boolean isMarked) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.isMarked = isMarked;
    }

    @Override
    public String toString() {
        return "(" + xCoordinate + ", " + yCoordinate + ")";
    }
}