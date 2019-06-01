package kz.epam.khassenov.lecture03;

import java.util.Locale;
import java.util.ResourceBundle;

public class BundleStart {
    private ResourceBundle bundle;

    public BundleStart(Locale locale){
        bundle = ResourceBundle.getBundle("resources.prop", locale);
    }

    public String getValue(String key){
        return bundle.getString(key);
    }

    public static void main(String[] args) {
        BundleStart bundleStart = new BundleStart(new Locale("kz", "KZ"));
        System.out.println(bundleStart.getValue("prop.key1"));

        bundleStart = new BundleStart(new Locale("en", "UK"));
        System.out.println(bundleStart.getValue("prop.key2"));
    }
}
