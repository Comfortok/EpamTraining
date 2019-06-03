package kz.epam.khassenov.lecture03;

public class MatchingWithSample {
    public static void main(String[] args) {
        String stringOne = "Her name is Tamara. She is a good girl.";
        String stringReplace = "Sonia";
        String result = stringOne.replaceFirst("She", stringReplace);
        System.out.println(result + "\n");

        String stringHelloFirst = "Hello";
        String stringHelloSecond = new String("Hello");
        if (stringHelloFirst == stringHelloSecond) System.out.println("(1) str1 are Equal to str2");
        else System.out.println("(1) str1 are Not Equal to str2");
        stringHelloSecond = stringHelloSecond.intern();
        if (stringHelloFirst == stringHelloSecond) System.out.println("(2) str1 are Equal to str2");
        else System.out.println("(2) str1 are Not Equal to str2");
        if (stringHelloFirst.equals(stringHelloSecond)) System.out.println("(3) str1 are Equal to str2");
        else System.out.println("(3) str1 are Not Equal to str2");
    }
}
