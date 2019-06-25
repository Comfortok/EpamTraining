package kz.epam.khassenov.practice01;

public class Helicopter extends AirVehicle {
    public double getMainRotorDiameter() {
        return mainRotorDiameter;
    }

    public void setMainRotorDiameter(double mainRotorDiameter) {
        this.mainRotorDiameter = mainRotorDiameter;
    }

    public double getTailRotorDiameter() {
        return tailRotorDiameter;
    }

    public void setTailRotorDiameter(double tailRotorDiameter) {
        this.tailRotorDiameter = tailRotorDiameter;
    }

    private double mainRotorDiameter;
    private double tailRotorDiameter;

    public void propellerTilter(String side){
        System.out.println("The helicopter is going " + side.toLowerCase() + ".");
    }

    public void verticalTakeoff(){
        System.out.println("The helicopter is getting higher.");
    }

    @Override
    void turn(String side) {
        if (side.toLowerCase().equals("right") || side.toLowerCase().equals("left")){
            System.out.println("The helicopter is turning " + side + ".");
        }
        else {
            System.out.println("Choose the side: right or left...");
        }
    }

    @Override
    public void move() {
        System.out.println("The helicopter is moving...");
    }

    @Override
    public void accelerate() {
        System.out.println("The helicopter is getting faster...");
    }

    @Override
    public void brake() {
        System.out.println("The helicopter is getting slower...");
    }
}
