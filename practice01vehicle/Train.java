package kz.epam.khassenov.practice01;

public class Train extends GroundVehicle {
    public int getCarriageCount() {
        return carriageCount;
    }

    public void setCarriageCount(int carriageCount) {
        this.carriageCount = carriageCount;
    }

    public double getElectricPower() {
        return electricPower;
    }

    public void setElectricPower(double electricPower) {
        this.electricPower = electricPower;
    }

    private int carriageCount;
    private double electricPower;

    protected void doorOpener(){
        announcer();
        System.out.println("Be careful! Doors are opening!");
        announcer();
        System.out.println("Doors are opened");
    }

    protected void doorCloser(){
        announcer();
        System.out.println("Be careful! Doors are closing!");
        announcer();
        System.out.println("Doors are closed");
    }

    protected static void announcer(){
        System.out.println("Bzzzzz");
    }

    @Override
    public void move() {
        System.out.println("The train is moving...");
    }

    @Override
    public void accelerate() {
        System.out.println("The train is getting faster...");
    }

    @Override
    public void brake() {
        System.out.println("The train is getting slower...");
    }
}
