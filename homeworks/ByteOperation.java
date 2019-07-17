package kz.epam.khassenov.homeworks;

import java.util.ArrayList;
import java.util.Collections;

public class ByteOperation {
    public static void main(String[] args) {
        String string = "101011";
        ArrayList<String> arrayList = new ArrayList<>();
        int firstInd = string.indexOf(1);
        int nextInd = string.indexOf(1, firstInd);
        int lastInd = string.lastIndexOf(1);
        for (int i = firstInd; i <= lastInd; i++){
            StringBuilder stringBuilder = new StringBuilder(string);
            String newString = stringBuilder.substring(i, lastInd);
            arrayList.add(newString);
        }
    }



    protected ArrayList<Integer> stringToNumberFormat(String inputNumber){
        inputNumber = deleteZeroFromStartOfString(inputNumber);
        ArrayList<Integer> arrayListOfBytes = new ArrayList<>();
        for (int i = 0; i < inputNumber.length(); i++){
            char currentChar = inputNumber.charAt(i);
            if ((currentChar != 0) || (currentChar != 1)){
                System.out.println("Wrong number format!");
                break;
            }else {
                arrayListOfBytes.add((int) currentChar);
            }
        }
        return arrayListOfBytes;
    }

    protected static String deleteZeroFromStartOfString(String inputString){
        String outputString = null;
        for (int i = 0; i < inputString.length(); ){
            if (inputString.charAt(i) != 1){
                i++;
            }else {
                    outputString.concat(inputString.substring(i));
                break;
            }
        }
        return outputString;
    }

    protected static String oneToZeroToOne(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)=='0') stringBuilder.append(1);
            else stringBuilder.append(0);
        }
        return String.valueOf(stringBuilder);
    }
}