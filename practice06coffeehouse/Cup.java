package kz.epam.khassenov.practice06coffeehouse;

public enum  Cup {
    STANDART ("Standart - 200 ml"),
    LARGE ("Large - 400 ml"),
    EXTRA ("Extra - 600 ml");

    private String size;

    Cup(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}