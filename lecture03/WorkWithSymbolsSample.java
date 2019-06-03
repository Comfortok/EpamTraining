package kz.epam.khassenov.lecture03;

public class WorkWithSymbolsSample {
    public static void main(String[] args) {
        String attention = "Внимание: ";
        String stringFirst = attention.concat("!");
        String stringSecond = attention.concat("!!");
        String stringThird = attention + "неизвестный символ";
        System.out.println("s1 + s2 = " + stringFirst + stringSecond);
        System.out.println("s3 = " + stringThird);
        String stringWithDigitsFirst = "2" + 2 + 2;
        String stringWithDigitsSecond = 2 + 2 + "2";
        String stringWithDigitsThird = "2" + (2 + 2);
        System.out.println("str1 = " + stringWithDigitsFirst + "; str2 = "
                + stringWithDigitsSecond + "; str3 = " + stringWithDigitsThird);
        System.out.println();

        String stringForth = "";
        try {
            stringForth.concat("abc");
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("s4.concat = " + stringForth);
        String stringFifth = null;
        System.out.println("s5 + abc = " + (stringFifth + "abc"));
        String stringSixth = "Blue";
        String stringSeventh = "Sky!";
        String stringEighth = stringSixth.concat(stringSeventh);
        System.out.println("s8 == s6? " + (stringEighth == stringSixth));
        String stringNines = "abc";
        String stringTenth = stringNines.concat("");
        System.out.println("s9 == s10? " + (stringNines == stringTenth));
    }
}
