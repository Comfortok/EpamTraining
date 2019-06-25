package kz.epam.khassenov.practice01;

public class Hydrocycle extends WaterVehicle {
    private double engineCapacity;

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    private double enginePower;

    public void turnoverIncreaser(){
        System.out.println("The turnover of hydrocycle is increasing.");
    }

    @Override
    public void turn(String side) {
        if (side.toLowerCase().equals("right") || side.toLowerCase().equals("left")){
            System.out.println("The hydrocycle is turning " + side + ".");
        }
        else {
            System.out.println("Choose the side: right or left...");
        }
    }

    @Override
    public void move() {
        System.out.println("The hydrocycle is moving...");
    }

    @Override
    public void accelerate() {
        System.out.println("The hydrocycle is getting faster...");
    }

    @Override
    public void brake() {
        System.out.println("The hydrocycle is getting slower...");
    }
}
