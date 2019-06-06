package kz.epam.khassenov.homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ByteAppFirst {
    public static void main(String[] args) {
        String s1 = "10101";

    }

    private static void addToPreResultArray(String s) {
        ArrayList<String> preResultArray = new ArrayList<>();
        int firstOnePos = s.indexOf('1');
        int lastOnePos = s.lastIndexOf('1');
        String subString;
        if ((lastOnePos - firstOnePos) != 1) {
            for (int i = firstOnePos + 1; i < lastOnePos; i++) {
                if (s.charAt(i) == '0') {
                    subString = s.substring(firstOnePos, lastOnePos);
                    preResultArray.add(subString);
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    private static void oneToZeroToOne(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)=='0') stringBuilder.append(1);
            else stringBuilder.append(0);
        }
        System.out.println(stringBuilder);
    }
}
