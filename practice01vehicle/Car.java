package kz.epam.khassenov.practice01vehicle;

public class Car extends GroundVehicle {
    private String transmission;

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    private String engineType;

    protected void turn(String side){
        if (side.toLowerCase().equals("right") || side.toLowerCase().equals("left")){
            System.out.println("The car is turning " + side + ".");
        }
        else {
            System.out.println("Choose the side: right or left...");
        }
    }

    protected void handBrakeSwithcer(boolean on){
        if (on == true){
            System.out.println("Hand Brake is on.");
        }
        else{
            System.out.println("Hand Brake is off. You may drive now.");
        }
    }

    @Override
    public void move() {
        System.out.println("The car is moving...");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is getting faster...");
    }

    @Override
    public void brake() {
        System.out.println("The car is getting slower...");
    }
}
