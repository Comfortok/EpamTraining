package kz.epam.khassenov.practice03morsecode;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseToSymbolViceVersaTranslator {
    public static HashMap<String, String> hashMapInitialization(HashMap<String, String> hashMap){
        hashMap.put(".-", "A");
        hashMap.put("-...", "B");
        hashMap.put("-.-.", "C");
        hashMap.put("-..", "D");
        hashMap.put(".", "E");
        hashMap.put("..-.", "F");
        hashMap.put("--.", "G");
        hashMap.put("....", "H");
        hashMap.put("..", "I");
        hashMap.put(".---", "J");
        hashMap.put("-.-", "K");
        hashMap.put(".-..", "L");
        hashMap.put("--", "M");
        hashMap.put("-.", "N");
        hashMap.put("---", "O");
        hashMap.put(".--.", "P");
        hashMap.put("--.-", "Q");
        hashMap.put(".-.", "R");
        hashMap.put("...", "S");
        hashMap.put("-", "T");
        hashMap.put("..-", "U");
        hashMap.put("...-", "V");
        hashMap.put(".--", "W");
        hashMap.put("-..-", "X");
        hashMap.put("-.--", "Y");
        hashMap.put("--..", "Z");
        hashMap.put(".----", "1");
        hashMap.put("..---", "2");
        hashMap.put("...--", "3");
        hashMap.put("....-", "4");
        hashMap.put(".....", "5");
        hashMap.put("-....", "6");
        hashMap.put("--...", "7");
        hashMap.put("---..", "8");
        hashMap.put("----.", "9");
        hashMap.put("-----", "0");
        return hashMap;
    }

    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\Olzhas\\IdeaProjects\\" +
                "EpamPractice\\src\\kz\\epam\\khassenov\\practice03morsecode\\InputFile.txt";
        String outputFileName = "C:\\Users\\Olzhas\\IdeaProjects\\" +
                "EpamPractice\\src\\kz\\epam\\khassenov\\practice03morsecode\\OutputFile.txt";
        try (BufferedReader inputFile = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter outputFile = new BufferedWriter(new FileWriter(outputFileName))) {
            String stringLine = inputFile.readLine();
            String regexFirst = "\\w+$";
            String regexSecond = "\\W+$";
            if (String.valueOf(stringLine.charAt(0)).matches(regexFirst)){
                convertSymbolToMorse(stringLine, outputFile);
            }
            else if (String.valueOf(stringLine.charAt(0)).matches(regexSecond)){
                convertMorseToSymbol(stringLine, outputFile);
            }
            else {
                System.out.println("Invalid text format!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void convertMorseToSymbol(String inputString, BufferedWriter outputFile) throws IOException {
        HashMap<String, String> hashMapOfMorseAndSymbol = new HashMap<>();
        hashMapInitialization(hashMapOfMorseAndSymbol);
        StringBuffer inputFileTextOfMorse = new StringBuffer();
        ArrayList<String> arrayListOfOutputSymbols = new ArrayList<>();
        Scanner scanner = new Scanner(String.valueOf(inputString));
        scanner.useDelimiter(";");
        while (scanner.hasNext()){
            String oneMorseString = scanner.next();
            inputFileTextOfMorse.append(oneMorseString + " ");
        }
        String regexThird = " ";
        String[] arrayOfMorseCode = String.valueOf(inputFileTextOfMorse).split(regexThird);
        for (int i = 0; i < arrayOfMorseCode.length; i++){
            if (findChar(hashMapOfMorseAndSymbol, arrayOfMorseCode[i])){
                arrayListOfOutputSymbols.add(returnCharFromText(hashMapOfMorseAndSymbol, arrayOfMorseCode[i]));
            }
        }
        for (String arrayElement : arrayListOfOutputSymbols) {
            outputFile.write(arrayElement);
        }
    }

    public static void convertSymbolToMorse(String inputString, BufferedWriter outputFile) throws IOException {
        HashMap<String, String> hashMapOfMorseAndSymbol = new HashMap<>();
        hashMapInitialization(hashMapOfMorseAndSymbol);
        ArrayList<String> arrayListOfOutputSymbol = new ArrayList<>();
        ArrayList<String> arrayListOfOutputMorse = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++){
            arrayListOfOutputSymbol.add(String.valueOf(inputString.charAt(i)));
        }

        int sizeOfSymbolArray = arrayListOfOutputSymbol.size();
        for (int i = 0; i < sizeOfSymbolArray; i++){
            if (findChar(hashMapOfMorseAndSymbol, arrayListOfOutputSymbol.get(i))){
                arrayListOfOutputMorse.add(returnCharFromText(hashMapOfMorseAndSymbol, arrayListOfOutputSymbol.get(i)));
            }
        }
        for (String arrayElement : arrayListOfOutputMorse) {
            outputFile.write(arrayElement + " ");
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