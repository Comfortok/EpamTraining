package kz.epam.khassenov.lecture03string;

import java.util.Locale;

public class InternationalisationSample {
    public static void main(String[] args) {
        {
            Locale defaultLocale = Locale.getDefault();
            Locale rusLocale = new Locale("ru", "RU");
            Locale usLocale = new Locale("en", "US");
            Locale frLocale = new Locale("fr", "FR");
            System.out.println(defaultLocale.getDisplayCountry());
            System.out.println(defaultLocale.getDisplayCountry(Locale.FRENCH));
            System.out.println(defaultLocale.getDisplayCountry(defaultLocale));
            System.out.println(frLocale.getDisplayCountry(defaultLocale));
            System.out.println(usLocale.getDisplayName());
            System.out.println(usLocale.getDisplayName(frLocale));
            System.out.println(rusLocale.getDisplayName(usLocale));
            System.out.println(defaultLocale.getCountry());
            System.out.println(defaultLocale.getLanguage());
            System.out.println(defaultLocale.getVariant());
        }
    }
}
