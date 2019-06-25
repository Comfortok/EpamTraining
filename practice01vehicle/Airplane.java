package kz.epam.khassenov.practice01vehicle;

public class Airplane extends AirVehicle {
    public double getTakeoffSpeed() {
        return takeoffSpeed;
    }

    public void setTakeoffSpeed(double takeoffSpeed) {
        this.takeoffSpeed = takeoffSpeed;
    }

    public double getBreakingDistance() {
        return breakingDistance;
    }

    public void setBreakingDistance(double breakingDistance) {
        this.breakingDistance = breakingDistance;
    }

    private double takeoffSpeed;
    private double breakingDistance;

    public void chassisReleaser(){
        System.out.println("Chassis are released.");
    }

    public void spoilerReleaser(){
        System.out.println("Spoilers are released.");
    }

    @Override
    void turn(String side) {
        if (side.toLowerCase().equals("right") || side.toLowerCase().equals("left")){
            System.out.println("The plane is turning " + side + ".");
        }
        else {
            System.out.println("Choose the side: right or left...");
        }
    }

    @Override
    public void move() {
        System.out.println("The plane is moving...");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane is getting faster...");
    }

    @Override
    public void brake() {
        System.out.println("The plane is getting slower...");
    }
}
