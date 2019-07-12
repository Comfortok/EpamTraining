package kz.epam.khassenov.lecture03string;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class InternationalisationDateFormatSample {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormatUSLong = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
        DateFormat dateFormatUSShort = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        System.out.println(dateFormatUSLong.format(date));
        System.out.println(dateFormatUSShort.format(date));
    }
}
