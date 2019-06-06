package kz.epam.khassenov.blinovtasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChapterSevenC4 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in))) {
            String inputString = bufferedReader.readLine();
            sortInputText(inputString);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    public static void sortInputText(String inputString){
            StringBuilder stringBuilder = new StringBuilder(inputString);
            int count = 1;
            for (int i = 1; i < stringBuilder.length(); ){
                int j = i - 1;
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)){
                    count++;
                    if (i + 1 != stringBuilder.length()){
                        i++;
                    }
                    else {
                        stringBuilder.insert(i + 1, count);
                        i = i + 2;
                    }
                }
                else if (count > 1){
                    stringBuilder.insert(i, count);
                    count = 1;
                    i = i + 2;
                }
                else {
                    count = 1;
                    i++;
                }
            }

            for (int i = 1; i < stringBuilder.length(); ){
                int j = i - 1;
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)){
                    stringBuilder.deleteCharAt(j);
                }
                else {
                    i++;
                }
            }
            System.out.println(stringBuilder);
    }
}