package kz.epam.khassenov.practice06coffeehouse;

public class Barista {
    public Espresso makeCoffee(Espresso coffee, int coffeeNumber){
        switch (coffeeNumber){
            case 1: coffee = new Espresso("Espresso", "Arabica", 35.0,
                    new Addition("Salt",1.0), new Addition("Sugar",3.0));
                System.out.println("Have a nice day!");
                break;
            case 2: coffee = new Americano("Americano", "Arabica", 155.0,
                    new Addition("Salt",1.0), new Addition("Sugar",3.0));
                System.out.println("Have a nice day!");
                break;
            case 3: coffee = new Cappucino("Cappucino", "Arabica", 155.0,
                    new Addition("Salt",1.0), new Addition("Sugar",3.0),
                    new Addition("Milk",50.0), new Addition("Wipped Milk", 100.0));
                System.out.println("Have a nice day!");
                break;
            case 4: coffee = new Latte("Latte", "Arabica", 155.0,
                    new Addition("Salt",1.0), new Addition("Sugar",3.0),
                    new Addition("Milk",100.0), new Addition("Wipped Milk",50.0));
                System.out.println("Have a nice day!");
                break;
            default:
                System.out.println("Wrong input number. Try again.");
                break;
        }
        return coffee;
    }

    public void addTopping(Espresso coffee, int toppingNumber){
        switch (toppingNumber){
            case 1: coffee.setTopping(new Topping("Cinnamon", 20.0));
            break;
            case 2: coffee.setTopping(new Topping("Syrup", 20.0));
            break;
            case 3:
                System.out.println("No toppings.");
                coffee.setTopping(new Topping("No topping"));
                break;
            default:
                System.out.println("No toppings");
                break;
        }
    }

    public void setCup(Espresso coffee, int cupNumber){
        switch (cupNumber){
            case 1: coffee.setCup(Cup.STANDART);
                break;
            case 2: coffee.setCup(Cup.LARGE);
                break;
            case 3:
                coffee.setCup(Cup.EXTRA);
                break;
            default:
                System.out.println("Choose the number from 1 to 3");
                break;
        }
    }
}