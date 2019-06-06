package kz.epam.khassenov.homeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ByteApp {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first number: ");
        String firstNumber = bufferedReader.readLine();
        System.out.print("Enter the second number: ");
        String secondNumber = bufferedReader.readLine();
        if (firstNumber.contains(secondNumber)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }*/
        Pattern pattern101 = Pattern.compile("1*01");
        Pattern pattern1001 = Pattern.compile("1*001");

        Matcher matcher101 = pattern101.matcher("101");
        boolean is101 = matcher101.matches();

        Matcher matcher1001 = pattern1001.matcher("10001");
        boolean is1001 = matcher1001.matches();
        System.out.println(is101 + " : " + is1001);
    }
}
