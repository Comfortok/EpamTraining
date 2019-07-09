package kz.epam.khassenov.practice07chess;

public class Main {
    public static void main(String[] args) {
        QueenOperation queenOperation = new QueenOperation();
        queenOperation.generateMovement();
        HorseOperation horseOperation = new HorseOperation();
        horseOperation.move();
    }
}