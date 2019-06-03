package kz.epam.khassenov.lecture03;

import java.util.*;

public class FormatterSpecificatorSample {
    public static void main(String[] args) {
        {
            Formatter formatter = new Formatter();
            boolean isTrue = true;
            Boolean isNull = null;
            formatter.format("1. - %b, %b\n", isTrue, isNull);
            System.out.print(formatter);
            System.out.println("-------------------");
            Timer timer = new Timer();
            formatter.format("2. - %h\n", timer);
            System.out.println(formatter);
            System.out.println(Integer.toHexString(timer.hashCode()));
            float floatNumber = (float) 2.2;
            formatter.format("3. - %f\n", floatNumber);
            System.out.println(formatter);
            Date date = new Date();
            formatter.format("4. - %tr\n", date.getTime());
            System.out.println(formatter);
            System.out.println();
        }
        {
            Formatter formatterSecond = new Formatter();
            double doubleNumber = 16.12345;
            formatterSecond.format("%1$e, %<f, %<g, %<a\n", doubleNumber);
            System.out.println(formatterSecond);
            System.out.println();
        }
        {
            Formatter formatterThird = new Formatter();
            int intNumber = 17;
            double doubleNumber = 16.12345;
            formatterThird.format("1. (%%o) %o%n", intNumber);
            formatterThird.format("2. (%%a) %a%n", doubleNumber);
            formatterThird.format("3. (%%x) %x%n", intNumber);

            formatterThird.format("4. (%%#o) %#o%n", intNumber);
            formatterThird.format("5. (%%#a) %#a%n", doubleNumber);
            formatterThird.format("6. (%%#x) %#x%n", intNumber);
            System.out.println(formatterThird);
            System.out.println();
        }
        {
            Formatter formatterForth = new Formatter();
            int intNumber = 345;
            double doubleNumber = 16.12345;
            formatterForth.format("- %-7dok%n", intNumber);
            formatterForth.format("- %+7dok%n", intNumber);
            formatterForth.format("- % 7dok%n", intNumber);
            formatterForth.format("- %07dok%n", intNumber);
            formatterForth.format("- %#7fok%n", doubleNumber);
            formatterForth.format("- %.7fok%n", doubleNumber);
            System.out.println(formatterForth);
            System.out.println();
        }
        {
            Calendar calendar = Calendar.getInstance();
            System.out.printf(Locale.FRANCE, "%1$tB %1$tA%n", calendar);
            System.out.printf(Locale.getDefault(), "%1$tB %1$tA%n", calendar);
        }
    }
}
