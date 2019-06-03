package kz.epam.khassenov.lecture03;

import kz.epam.khassenov.otherpackage.PoolOfLiteralsOtherPackage;

public class PoolOfLiteralsSample {
    public static void main(String[] args) {
        String stringFirst = "Hello";
        String stringSecond = new StringBuffer("He").append("llo").toString();
        String stringThird = stringSecond.intern();
        System.out.println("s1 == s2? " + (stringFirst == stringSecond));
        System.out.println("s1 == s3? " + (stringFirst == stringThird));
        String hello = "Hello", lo = "lo";
        System.out.print((hello == "Hello") + " ");
        System.out.print((PoolOfLiteralsOther.hello == hello) + " ");
        System.out.print((PoolOfLiteralsOtherPackage.hello == hello) + " ");
        System.out.print((hello == ("Hel" + "lo")) + " ");
        System.out.print((hello == ("Hel" + lo)) + " ");
        System.out.println(hello == ("Hel" + lo).intern());
    }
}
