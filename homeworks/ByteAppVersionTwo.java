package kz.epam.khassenov.homeworks;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class ByteAppVersionTwo {
    public static void main(String[] args) {
      String first = "10101";
      String second = "01010";
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for (int i = 0; i < first.length(); i++){
            arrayList.add(first.charAt(i));
        }
        for (int i = 0; i < arrayList.size()-1; i++){
            for (int j = 1; j < arrayList.size(); j++){

            }
            System.out.println(arrayList.get(i));
        }
    }
}
