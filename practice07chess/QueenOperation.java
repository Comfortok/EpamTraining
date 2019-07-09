package kz.epam.khassenov.practice07chess;

import java.util.ArrayList;
import java.util.List;

public class QueenOperation {
    protected List<Queen> createQueenList(List<Queen> queenList, int count){
        for (int i = 0; i < count; i++){
            queenList.add(new Queen(1, i + 1));
        }
        return queenList;
    }

    protected boolean isOnSameLine(Queen chessFirst, Queen chessSecond){
        boolean result;
        int firstQueenX = chessFirst.getXCoordinate();
        int firstQueenY = chessFirst.getYCoordinate();
        int secondQueenX = chessSecond.getXCoordinate();
        int secondQueenY = chessSecond.getYCoordinate();
        if ((firstQueenX == secondQueenX) && (firstQueenY == secondQueenY)){
            result = false;
        }
        else if (firstQueenX == secondQueenX){
            result = true;
        }
        else if((Math.abs(firstQueenX - secondQueenX)) == (Math.abs(firstQueenY - secondQueenY))){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }

    protected void generateMovement(){
        int queenCount = 8;
        List<Queen> queenList = new ArrayList<>();
        createQueenList(queenList, queenCount);
        for (int i = 1; i < queenCount; ){
            for (int j = 0; j < i; ){
                    while (isOnSameLine(queenList.get(i), queenList.get(j))){
                        queenList.get(i).setXCoordinate(queenList.get(i).getXCoordinate() + 1);
                        if (queenList.get(i).getXCoordinate() > queenCount){
                            queenList.get(i).setXCoordinate(1);
                            queenList.get(i - 1).setXCoordinate(queenList.get(i - 1).getXCoordinate() + 1);
                        }
                        i--;
                        j = 0;
                    }
                if (queenList.get(i).getXCoordinate() > queenCount){
                    queenList.get(i).setXCoordinate(1);
                    queenList.get(i - 1).setXCoordinate(queenList.get(i - 1).getXCoordinate() + 1);
                }
                j++;
            }
            i++;
        }

        for (Queen queen : queenList){
            System.out.println(queen);
        }
    }
}