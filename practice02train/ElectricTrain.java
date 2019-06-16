package kz.epam.khassenov.practice02train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectricTrain {
    private static final double FRICTIONCOEFFICIENT = 0.05;
    private static final double HEADTRAINWEIGHT = 6000;
    private static final double CARRIAGEWEIGHT = 10000;
    private static final double ACCELERATIONOFGRAVITY = 9.8;
    private static final int KILO = 1000;
    private static double tractionForce;
    private static double maxCarriageCount;
    private static int carriageDifferences;

    public static void main(String[] args){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the power of the electric train (in kiloWatts): ");
            String stringEnginePower = bufferedReader.readLine();
            double enginePower = Double.parseDouble(stringEnginePower) * KILO;
            System.out.println("engine power: " + enginePower);
            System.out.print("Enter the number of carriages: ");
            String stringCarriageCount = bufferedReader.readLine();
            int carriageCount = Integer.parseInt(stringCarriageCount);
            maxCarriageCount = ((enginePower / (FRICTIONCOEFFICIENT * ACCELERATIONOFGRAVITY)) - HEADTRAINWEIGHT) / CARRIAGEWEIGHT;
            carriageDifferences = ((int) Math.round(maxCarriageCount) - carriageCount);
            if ((tractionForceCalculation(carriageCount) >= enginePower) && carriageDifferences != 0) {
                System.out.println("The train can't take " + carriageCount + " carriages. Yo have to detach: "
                        + Math.abs(carriageDifferences) + " carriage(s)");
            } else if ((tractionForceCalculation(carriageCount) < enginePower) && carriageDifferences != 0) {
                System.out.println("Great! The train is ready. You also can attach "
                        + carriageDifferences + " more");
            } else {
                System.out.println("Great! Train is ready.");
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    private static double tractionForceCalculation(int carriageCount){
        tractionForce = FRICTIONCOEFFICIENT * ACCELERATIONOFGRAVITY * (HEADTRAINWEIGHT + (carriageCount * CARRIAGEWEIGHT));
        return tractionForce;
    }
}