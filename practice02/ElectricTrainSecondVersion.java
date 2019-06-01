package kz.epam.khassenov.practice02;

public class ElectricTrainSecondVersion {
    public static final double frictionCoefficient = 0.05;
    public static final double carriageWeight = 10000;
    public static final double accelerationOfGravity = 9.8;
    public static final double kilo = 1000.0;
    private static double tractionForce;
    private static int maxCarriageCount;
    private static int carriageDifferences;
    private int carriageCount;
    private double trainWeight;
    private double enginePower;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTrainWeight() {
        return trainWeight;
    }

    public void setTrainWeight(double trainWeight) {
        this.trainWeight = trainWeight;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public ElectricTrainSecondVersion() {
    }

    public ElectricTrainSecondVersion(String name, double enginePower, double trainWeight, int carriageCount) {
        this.name = name;
        this.enginePower = enginePower;
        this.trainWeight = trainWeight;
        this.carriageCount = carriageCount;
    }

    protected void move(){
        tractionForce = frictionCoefficient * accelerationOfGravity * (trainWeight + (carriageCount * carriageWeight));
        enginePower = enginePower * kilo;
        maxCarriageCount = (int)Math.round(((enginePower/(frictionCoefficient * accelerationOfGravity)) - trainWeight) / carriageWeight);
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

    public static void main(String[] args) {
        ElectricTrainSecondVersion myTrain = new ElectricTrainSecondVersion("Electro520",520.0, 6000.0, 105);
        myTrain.move();
    }
}
