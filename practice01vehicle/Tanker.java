package kz.epam.khassenov.practice01vehicle;

public class Tanker extends WaterVehicle {
    private String powerStation;

    public String getPowerStation() {
        return powerStation;
    }

    public void setPowerStation(String powerStation) {
        this.powerStation = powerStation;
    }

    public double getDeckLength() {
        return deckLength;
    }

    public void setDeckLength(double deckLength) {
        this.deckLength = deckLength;
    }

    private double deckLength;

    public void beep(){
        System.out.println("BEEEEEP!");
    }

    public void cargoLifter(int mass){
        System.out.println(mass + " were lifted on board.");
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
        System.out.println("The tanker is moving...");
    }

    @Override
    public void accelerate() {
        System.out.println("The tanker is getting faster...");
    }

    @Override
    public void brake() {
        System.out.println("The tanker is getting slower...");
    }
}
