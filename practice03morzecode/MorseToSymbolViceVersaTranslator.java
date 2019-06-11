package kz.epam.khassenov.practice03morzecode;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseToSymbolViceVersaTranslator {
    public static void main(String[] args) {
        try (BufferedReader inputFile = new BufferedReader(new FileReader("C:\\Users\\Olzhas\\IdeaProjects\\" +
                "EpamPractice\\src\\kz\\epam\\khassenov\\practice03morzecode\\InputFile.txt"));
             BufferedWriter outputFile = new BufferedWriter(new FileWriter("C:\\Users\\Olzhas\\IdeaProjects\\" +
                     "EpamPractice\\src\\kz\\epam\\khassenov\\practice03morzecode\\OutputFile.txt"))) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("...", "S");
            hashMap.put("---", "O");
            hashMap.put(";", " ");
            hashMap.put(" ", "");
            StringBuilder inputFileTextOfMorse = new StringBuilder();
            StringBuilder inputFileTextOfChar = new StringBuilder();
            ArrayList<String> arrayListOfSymbols = new ArrayList<>();
            ArrayList<String> arrayListOfSymbolsTwo = new ArrayList<>();
            Scanner scanner = new Scanner(inputFile);
            if (scanner.hasNext("\\W+")) {
                scanner.useDelimiter(";");
                while (scanner.hasNext()) {
                    String stringWord = scanner.next();
                    inputFileTextOfMorse.append(stringWord + " ");
                }
                String[] arrayOfMorseCode = String.valueOf(inputFileTextOfMorse).split(" ");
                for (int i = 0; i < arrayOfMorseCode.length; i++) {
                    if (findChar(hashMap, arrayOfMorseCode[i])) {
                        arrayListOfSymbols.add(returnCharFromText(hashMap, arrayOfMorseCode[i]));
                    }
                }
            }
            //else if (scanner.hasNext("\\w+")) {
            else if (scanner.hasNext("\\w+")) {
                System.out.println(inputFile.read());
                int charOfInputFileText = inputFile.read();
                while (charOfInputFileText != -1) {
                    inputFileTextOfChar.append((char) charOfInputFileText + " ");
                    charOfInputFileText = inputFile.read();
                    System.out.println(inputFileTextOfChar);
                }
                System.out.println(inputFileTextOfChar);
                for (int i = 0; i < inputFileTextOfChar.length(); i++){
                    arrayListOfSymbolsTwo.add(String.valueOf(inputFileTextOfChar.charAt(i)));
                }
                for (String s : arrayListOfSymbolsTwo) {
                    System.out.print(s + "");
                }
                for (int i = 0; i < arrayListOfSymbolsTwo.size(); i++) {
                    if (findChar(hashMap, arrayListOfSymbolsTwo.get(i))) {
                        arrayListOfSymbols.add(returnCharFromText(hashMap, arrayListOfSymbolsTwo.get(i)));
                    }
                }
            }
            else {
                System.out.println("Wrong input text in file...");
            }
            for (String s : arrayListOfSymbols) {
                outputFile.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String returnCharFromText(HashMap<String, String> hashMap, String inputChar) {
        String result = null;
        for (Map.Entry<String, String> pair : hashMap.entrySet()) {
            if (pair.getKey().equals(inputChar)) {
                result = pair.getValue();
            } else if (pair.getValue().equals(inputChar)) {
                result = pair.getKey();
            } else {
            }
        }
        return result;
    }

    public static boolean findChar(HashMap<String, String> hashMap, String inputChar) {
        boolean result = false;
        for (Map.Entry<String, String> pair : hashMap.entrySet()) {
            if (pair.getKey().equals(inputChar)) {
                result = true;
            } else if (pair.getValue().equals(inputChar)) {
                result = true;
            } else {
            }
        }
        return result;
    }
}