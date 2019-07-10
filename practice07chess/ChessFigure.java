package kz.epam.khassenov.practice07chess;

public abstract class ChessFigure {
    protected int xCoordinate;
    protected int yCoordinate;

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public ChessFigure() {
    }

    public ChessFigure(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public ChessFigure put(int xCoordinate, int yCoordinate){
        this.setXCoordinate(xCoordinate);
        this.setYCoordinate(yCoordinate);
        return this;
    }

    public abstract void generateSolution();

    @Override
    public String toString() {
        String result;
        switch (xCoordinate){
            case 1: result = "A";
                break;
            case 2: result = "B";
                break;
            case 3: result = "C";
                break;
            case 4: result = "D";
                break;
            case 5: result = "E";
                break;
            case 6: result = "F";
                break;
            case 7: result = "G";
                break;
            case 8: result = "H";
                break;
            default: result = null;
        }
        return "Another figure is on " + result + yCoordinate;
    }
}