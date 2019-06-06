package kz.epam.khassenov.lecture03;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class InternationalisationNumberFormatSample {
    public static void main(String[] args) {
        {
            int[] intArray = {100, 1000, 10_000, 100_000};
            NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i] + "\t" + numberFormat.format(intArray[i]));
            }
            System.out.println();
        }
        double doubleNumber = 9876.543;
        {
            NumberFormat numberFormatGermany = NumberFormat.getNumberInstance(Locale.GERMANY);
            NumberFormat numberFormatJapan = NumberFormat.getNumberInstance(Locale.JAPAN);
            NumberFormat numberFormatFrance = NumberFormat.getNumberInstance(Locale.FRANCE);
            System.out.println(": " + numberFormatGermany.format(doubleNumber));
            System.out.println(": " + numberFormatJapan.format(doubleNumber));
            System.out.println(": " + numberFormatFrance.format(doubleNumber));
            System.out.println();
        }
        {
            NumberFormat numberFormatGermany = NumberFormat.getCurrencyInstance(Locale.GERMANY);
            NumberFormat numberFormatKazakhstan = NumberFormat.getCurrencyInstance(new Locale("kz", "KZ"));
            NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
            System.out.println(": " + numberFormatGermany.format(doubleNumber));
            System.out.println(": " + numberFormatKazakhstan.format(doubleNumber));
            System.out.println(": " + numberFormatUS.format(doubleNumber));
            System.out.println();
        }
        {
            try{
            String numberGermany = "9.876,598";
            NumberFormat numberFormatGermany = NumberFormat.getNumberInstance(Locale.GERMANY);
            NumberFormat currencyFormatGermany = NumberFormat.getCurrencyInstance(Locale.GERMANY);
                double doubleNumberGermany = (Double) numberFormatGermany.parse(numberGermany);
                String stringCurrencyGermany = currencyFormatGermany.getCurrency().getCurrencyCode();
                System.out.println(doubleNumberGermany);
                System.out.println(doubleNumberGermany + " " + stringCurrencyGermany);
            }
            catch (ParseException e){
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
