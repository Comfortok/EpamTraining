package kz.epam.khassenov.lecture03;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class FormatTest {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        double d = 77.12345;
        formatter.format("%1$e, %<f, %<h, %a\n", d);
        System.out.println(formatter);

        Formatter formatter1 = new Formatter();
        //Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        formatter1.format("%tr", calendar);
        System.out.println(formatter1);
        System.out.printf(Locale.CHINA, "%1$tB %1$tA%n", calendar);
        System.out.printf(Locale.getDefault(), "%1$tB %1$tA%n", calendar);

        Locale locale = new Locale("kz", "KZ");
        System.out.println(locale.getDisplayCountry(Locale.ENGLISH));
    }
}
