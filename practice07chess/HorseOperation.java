package kz.epam.khassenov.practice07chess;

import java.util.*;

public class HorseOperation {
    private static int step = 0;

    protected void move(){
        int randomX = (int) ((Math.random() * 7) + 1);
        int randomY = (int) ((Math.random() * 7) + 1);
        Horse horse = new Horse(randomX, randomY, true);
        step++;

        while (step <= 64){
            System.out.println("Horse " + step + " on " + horse);
            List<Horse> horseList = new ArrayList<>(nextStep(horse));
            List<Integer> countList = new ArrayList<>(nextPossibleStepCount(horseList));

            int min = countList.get(0);
            int index = 0;
            for (int i = 1; i < countList.size(); i++){
                if (min > countList.get(i)){
                    min = countList.get(i);
                    index = i;
                }else {
                }
            }
            horse.setxCoordinate(horseList.get(index).getxCoordinate());
            horse.setyCoordinate(horseList.get(index).getyCoordinate());
            step++;
        }
    }

    protected List<Horse> nextStep(Horse horse) {
        List<Horse> theoreticalStep = new ArrayList<>();
        int x = horse.getxCoordinate();
        int y = horse.getyCoordinate();
        theoreticalStep.add(new Horse(x + 1, y + 2, false));
        theoreticalStep.add(new Horse(x + 2, y + 1, false));
        theoreticalStep.add(new Horse(x + 2, y - 1, false));
        theoreticalStep.add(new Horse(x + 1, y - 2, false));
        theoreticalStep.add(new Horse(x - 1, y - 2, false));
        theoreticalStep.add(new Horse(x - 2, y - 1, false));
        theoreticalStep.add(new Horse(x - 2, y + 1, false));
        theoreticalStep.add(new Horse(x - 1, y + 2, false));

        for (int i = 0; i < theoreticalStep.size(); i++) {
            if ((theoreticalStep.get(i).getxCoordinate() > 8) ||
                    (theoreticalStep.get(i).getyCoordinate() > 8) ||
                    (theoreticalStep.get(i).getxCoordinate() < 1) ||
                    (theoreticalStep.get(i).getyCoordinate() < 1)) {
                theoreticalStep.get(i).setxCoordinate(0);
                theoreticalStep.get(i).setyCoordinate(0);
            }
        }

        List<Horse> possibleStep = new ArrayList<>();
        for (int i = 0; i < theoreticalStep.size(); i++){
            if (theoreticalStep.get(i).getxCoordinate() == 0) {
            } else {
                possibleStep.add(theoreticalStep.get(i));
            }
        }
        return possibleStep;
    }

    protected List<Integer> nextPossibleStepCount(List<Horse> horseList){
        List<List<Horse>> countListOfHorses = new ArrayList<>();
        List<Integer>  countList = new ArrayList<>();
        for (int i = 0; i < horseList.size(); i++){
            countListOfHorses.add(nextStep(horseList.get(i)));
            countList.add(countListOfHorses.get(i).size());
        }
        return countList;
    }
}