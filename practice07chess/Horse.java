package kz.epam.khassenov.practice07chess;

import java.util.ArrayList;
import java.util.List;

public class Horse extends ChessFigure{
    private static int step = 0;
    private ChessFigure[] passedPosition = new ChessFigure[64];

    public Horse() {
    }

    public Horse(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public void generateSolution() {
        int randomXCoordinate = (int) ((Math.random() * 7) + 1);
        int randomYCoordinate = (int) ((Math.random() * 7) + 1);
        Horse horse = new Horse();
        horse.put(randomXCoordinate, randomYCoordinate);
        while (step < 64){
            System.out.println("Step " + step + ". " + horse);
            passedPosition[step] = new Horse(horse.getXCoordinate(), horse.getYCoordinate());
            List<ChessFigure> possibleStepList = new ArrayList<>(showPossibleStep(horse));
            List<Integer> possibleStepCountList = new ArrayList<>(nextPossibleStepCount(possibleStepList));
            if (possibleStepList.size() < 1){
                System.out.println("Success!");
                break;
            }else {
                int min = possibleStepCountList.get(0);
                int indexOfMin = 0;
                for (int i = 1; i < possibleStepCountList.size(); i++){
                    if (min > possibleStepCountList.get(i)){
                        min = possibleStepCountList.get(i);
                        indexOfMin = i;
                    }else {
                    }
                }
                int newXCoordinate = possibleStepList.get(indexOfMin).getXCoordinate();
                int newYCoordinate = possibleStepList.get(indexOfMin).getYCoordinate();
                horse.put(newXCoordinate, newYCoordinate);
                step++;
            }
        }
    }

    protected List<ChessFigure> showPossibleStep(ChessFigure horse){
        List<ChessFigure> possibleStepList = new ArrayList<>();
        int x = horse.getXCoordinate();
        int y = horse.getYCoordinate();
        possibleStepList.add(new Horse(x + 1, y + 2));
        possibleStepList.add(new Horse(x + 2, y + 1));
        possibleStepList.add(new Horse(x + 2, y - 1));
        possibleStepList.add(new Horse(x + 1, y - 2));
        possibleStepList.add(new Horse(x - 1, y - 2));
        possibleStepList.add(new Horse(x - 2, y - 1));
        possibleStepList.add(new Horse(x - 2, y + 1));
        possibleStepList.add(new Horse(x - 1, y + 2));
        for (int i = 0; i < possibleStepList.size(); ) {
            if ((possibleStepList.get(i).getXCoordinate() > 8)
                    || (possibleStepList.get(i).getYCoordinate() > 8)
                    || (possibleStepList.get(i).getXCoordinate() < 1)
                    || (possibleStepList.get(i).getYCoordinate() < 1)) {
                possibleStepList.remove(i);
            }else {
                i++;
            }
        }
        for (int i = 0; i < passedPosition.length; i++){
            if (passedPosition[i] == null){
                break;
            }else {
                for (int j = 0; j < possibleStepList.size(); ){
                    if ((passedPosition[i].getXCoordinate()
                            == possibleStepList.get(j).getXCoordinate())
                            && (passedPosition[i].getYCoordinate()
                            == possibleStepList.get(j).getYCoordinate())){
                        possibleStepList.remove(j);
                    }else {
                        j++;
                    }
                }
            }
        }
        return possibleStepList;
    }

    protected List<Integer> nextPossibleStepCount(List<ChessFigure> possibleStepList){
        List<List<ChessFigure>> countListOfPossibleStep = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        for (int i = 0; i < possibleStepList.size(); i++){
            countListOfPossibleStep.add(showPossibleStep(possibleStepList.get(i)));
            countList.add(countListOfPossibleStep.get(i).size());
        }
        return countList;
    }

    @Override
    public String toString() {
        return super.toString() + " (Horse)";
    }
}