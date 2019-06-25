package kz.epam.khassenov.practice01vehicle;

public abstract class Vehicle {
    protected double maxSpeed;
    protected double weight;
    protected double length;
    protected double width;
    protected double height;
    protected String type;
    protected boolean isEngined;
    protected int seatCount;
    protected String name;

    public abstract void move();
    public abstract void accelerate();
    public abstract void brake();

    public static void main(String[] args) {
        Car car = new Car();
        car.maxSpeed = 250;
        car.accelerate();
        car.move();
        car.brake();
        car.handBrakeSwithcer(true);
        car.setTransmission("Automatic");
        car.setEngineType("Turbo");
        System.out.println("Car's transmission: " + car.getTransmission());
    }
}
