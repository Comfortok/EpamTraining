package kz.epam.khassenov.lecture04iostream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StreamFirst {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("C:\\StreamFirstTextFile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.print("This is a text sample in file...");
            printWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
