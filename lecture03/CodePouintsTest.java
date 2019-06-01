package kz.epam.khassenov.lecture03;

public class CodePouintsTest {
    public static void main(String[] args) {
        String str = "ЯПЛАКАЛъ";
        System.out.println("String str: " + str);
        System.out.println("String length: " + str.length());
        System.out.println("String length in Bytes: " + str.getBytes().length);
        /*for (int i = 0; i < str.codePointCount(0, str.length()); i++){
            int index = str.offsetByCodePoints(0, i);
            int code = str.codePointAt(index);
            int[] mas = {code};
            System.out.println("Symbol No " + i + ": "
            + Integer.toHexString(code) + " " + new String(mas, 0, mas.length));
        }*/
        System.out.println();
        System.out.println(str.offsetByCodePoints(5, 3));
        System.out.println(str.codePointAt(3));
        System.out.println(Integer.toHexString(str.codePointAt(5)));
        System.out.println();
        int[] mas2 = {1040, 1080};
        String str2 = new String(mas2, 0, mas2.length);
        System.out.println(str2);
        System.out.println();
        String s3 = new StringBuffer("He").append("llo").toString();
    }
}
