package kz.epam.khassenov.lecture03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("1+");
        Matcher m = p.matcher("101101");
        boolean b = m.matches();
        System.out.println(b);
    }
}
