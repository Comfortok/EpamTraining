package kz.epam.khassenov.practice07chess;

public class Queen {
    private int xCoordinate;
    private int yCoordinate;

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

    public Queen() {
    }

    public Queen(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

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
        return "Another Queen on " + result + yCoordinate;
    }
}