package kz.epam.khassenov.lecture03string;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class ResourceBundleSample extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
            { "prop.key1", "value01" },
            { "prop.key2", "value02" },
        };
    }

    public static void main(String[] args) {
        ResourceBundle resourceBundle;
        String key = "prop.key1";
        resourceBundle = ResourceBundle.getBundle("kz.epam.khassenov.lecture03.ResourceBundleSample");
        System.out.println(resourceBundle.getString(key));
    }
}
