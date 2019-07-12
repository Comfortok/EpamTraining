package kz.epam.khassenov.lecture03string;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceProperty {
    private ResourceBundle resourceBundle;
    public ResourceProperty(Locale locale){
        resourceBundle = ResourceBundle.getBundle("kz.epam.khassenov.resources.prop", locale);
    }

    public String getValue(String key){
        return resourceBundle.getString(key);
    }

    public static void main(String[] args) {
        ResourceProperty resourceProperty = new ResourceProperty(new Locale("en", "US"));
        System.out.println(resourceProperty.getValue("prop.key1"));

        resourceProperty = new ResourceProperty(new Locale("en", "UK"));
        System.out.println(resourceProperty.getValue("prop.key2"));

        resourceProperty = new ResourceProperty(new Locale("ru", "BY"));
        System.out.println(resourceProperty.getValue("prop.key1"));

        resourceProperty = new ResourceProperty(new Locale("ru", "RU"));
        System.out.println(resourceProperty.getValue("prop.key2"));
    }
}
