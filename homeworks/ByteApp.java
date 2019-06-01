package kz.epam.khassenov.homeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteApp {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first number: ");
        String firstNumber = bufferedReader.readLine();
        System.out.print("Enter the second number: ");
        String secondNumber = bufferedReader.readLine();
        if (firstNumber.contains(secondNumber)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
