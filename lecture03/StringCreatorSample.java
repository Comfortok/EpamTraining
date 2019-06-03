package kz.epam.khassenov.lecture03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringCreatorSample {
    public static void main(String[] args) {
        String stringFirst = new String();
        char[] dataFirst = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String stringSecond = new String(dataFirst, 2, 3);
        char[] dataSecond = { '\u004A', '\u0062', 'V', 'A' };
        String str3 = new String(dataSecond);
        byte ascii[] = { 65, 66, 67, 68, 69, 70 };
        String stringForth = new String(ascii);
        byte[] dataThird = { (byte) 0xE3, (byte) 0xEE };

        char characterFirst = '现';
        String stringFifth = new String("现");
        int byteDigit = stringFirst.getBytes().length;
        System.out.println("String size = " + stringFifth.getBytes().length);
        System.out.println(characterFirst);
        System.out.println(stringFifth);
        try {
            String stringSixth = new String(dataThird, "CP1251");
            String stringSeventh = new String(dataThird, "CP866");
        }catch (Exception exception){
            exception.printStackTrace();
        }

        String stringEighth = "现已整合";
        System.out.println("String - " + stringEighth);
        System.out.println("String length - " + stringEighth.length());
        System.out.println("String length in bytes - " + stringEighth.getBytes().length);
        for (int i = 0; i < stringEighth.codePointCount(0, stringEighth.length()); i++){
            int index = stringEighth.offsetByCodePoints(0, i);
            int code = stringEighth.codePointAt(index);
            int[] intArrayFirst = { code };
            System.out.println("symbol No " + i + Integer.toHexString(code)
            + " " + new String(intArrayFirst, 0, intArrayFirst.length));
        }

        int[] intArraySecond = { 0x3fdc, 0x4010 };
        String stringNinth = new String(intArraySecond, 0, intArraySecond.length);
        System.out.println("String - " + stringNinth);
        System.out.println("String length - " + stringNinth.length());
        System.out.println("String length in bytes - " + stringNinth.getBytes().length);

        String stringTenth = "Мама мыла раму1!";
        byte[] strCP866 = stringTenth.getBytes(Charset.forName("cp866"));
        byte[] strCP1251 = new byte[0];
        try {
            strCP1251 = stringTenth.getBytes("cp1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        for (byte bIndex : strCP866) System.out.print(bIndex + " ");
        System.out.println();
        for (byte bIndex : strCP1251)System.out.print(bIndex + " ");
        System.out.println();
        System.out.println(new String(strCP866));
        try {
            System.out.println(new String(strCP866, "cp866"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(new String(strCP1251));
    }
}
