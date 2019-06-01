package kz.epam.khassenov.practice02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectricTrain {
    public static final double frictionCoefficient = 0.05;
    public static final double trainWeight = 6000;
    public static final double carriageWeight = 10000;
    public static final double accelerationOfGravity = 9.8;
    public static final double kilo = 1000.0;
    private static double tractionForce;
    private static double maxCarriageCount;
    private static int carriageDifferences;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the power of the electric train (in kiloWatts): ");
        String stringEnginePower = bufferedReader.readLine();
        double enginePower = Double.parseDouble(stringEnginePower) * kilo;
        System.out.print("Enter the number of carriages: ");
        String stringCarriageCount = bufferedReader.readLine();
        int carriageCount = Integer.parseInt(stringCarriageCount);
        maxCarriageCount = ((enginePower/(frictionCoefficient * accelerationOfGravity)) - trainWeight) / carriageWeight;
        carriageDifferences = ((int)Math.round(maxCarriageCount) - carriageCount);
        if ((tractionForceCalculation(carriageCount) >= enginePower) && carriageDifferences != 0){
            System.out.println("The train can't take " + carriageCount + " carriages. Yo have to detach: "
                    + Math.abs(carriageDifferences) + " carriage(s)");
        }
        else if ((tractionForceCalculation(carriageCount) < enginePower) && carriageDifferences != 0){
            System.out.println("Great! The train is ready. You also can attach "
                    + carriageDifferences + " more");
        }
        else {
            System.out.println("Great! Train is ready.");
        }
    }

    public static double tractionForceCalculation(int carriageCount){
        tractionForce = frictionCoefficient * accelerationOfGravity * (trainWeight + (carriageCount * carriageWeight));
        return tractionForce;
    }
}
