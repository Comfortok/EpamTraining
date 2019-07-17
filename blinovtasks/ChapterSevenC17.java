package kz.epam.khassenov.blinovtasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChapterSevenC17 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in))){
            String inputString = bufferedReader.readLine();
            String patternW = "\\W+";
            String patternFirst = "\\s+|,\\s*";
            Pattern patternSecond = Pattern.compile(patternW);
            String[] unsortedArray = inputString.split(patternFirst);
            ArrayList<String> preResultArray = new ArrayList<>();
            for (int i = 0; i < unsortedArray.length; i++){
                Matcher matcherSecond = patternSecond.matcher(unsortedArray[i]);
                if (matcherSecond.find()){
                }
                else {
                    preResultArray.add(unsortedArray[i]);
                }
            }

            ArrayList<String> resultArray = new ArrayList<>();
            int size = preResultArray.size();
            resultArray.add(preResultArray.get(size - 1));
            for (int i = 0; i < size - 1; i++){
                resultArray.add(preResultArray.get(i));
            }
            for (String s : resultArray){
                System.out.print(s + " ");
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}