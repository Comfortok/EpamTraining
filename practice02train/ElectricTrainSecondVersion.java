package kz.epam.khassenov.practice02train;

public class ElectricTrainSecondVersion {
    private static final double FRICTIONCOEFFICIENT = 0.05;
    private static final double CARRIAGEWEIGHT = 10000;
    private static final double ACCELERATIONOFGRAVITY = 9.8;
    private static final int KILO = 1000;
    private static double tractionForce;
    private static int maxCarriageCount;
    private static int carriageDifferences;
    private int carriageCount;
    private double headTrainWeight;
    private double enginePower;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeadTrainWeight() {
        return headTrainWeight;
    }

    public void setTrainWeight(double headTrainWeight) {
        this.headTrainWeight = headTrainWeight;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public ElectricTrainSecondVersion() {
    }

    public ElectricTrainSecondVersion(String name, double enginePower, double headTrainWeight, int carriageCount) {
        this.name = name;
        this.enginePower = enginePower;
        this.headTrainWeight = headTrainWeight;
        this.carriageCount = carriageCount;
    }

    protected void trainMovement(){
        tractionForce = FRICTIONCOEFFICIENT * ACCELERATIONOFGRAVITY * (headTrainWeight + (carriageCount * CARRIAGEWEIGHT));
        enginePower = enginePower * KILO;
        maxCarriageCount = (int)Math.round(((enginePower/(FRICTIONCOEFFICIENT * ACCELERATIONOFGRAVITY)) - headTrainWeight) / CARRIAGEWEIGHT);
        carriageDifferences = ((int)Math.round(maxCarriageCount) - carriageCount);
        if ((tractionForce >= enginePower) && carriageDifferences != 0){
            System.out.println(name + " can't take " + carriageCount + " carriages. Yo have to detach: "
                    + Math.abs(carriageDifferences) + " carriage(s)");
        }
        else if ((tractionForce < enginePower) && carriageDifferences != 0){
            System.out.println("Great! " + name + " is ready. You also can attach "
                    + carriageDifferences + " more");
        }
        else {
            System.out.println("Great! " + name + " is ready.");
        }
    }
}
