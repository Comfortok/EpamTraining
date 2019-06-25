package kz.epam.khassenov.practice01vehicle;

public abstract class AirVehicle extends Vehicle{
protected int maxAltitude;
protected int crewCount;

abstract void turn(String side);
}

