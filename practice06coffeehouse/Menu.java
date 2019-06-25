package kz.epam.khassenov.practice06coffeehouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public void show(){
        System.out.println("Welcome to our Coffee House!");
        System.out.println("Please, choose the coffee by selecting the number.");
        System.out.println("1.\tEspresso");
        System.out.println("2.\tAmericano");
        System.out.println("3.\tCappucino");
        System.out.println("4.\tLatte");
        System.out.println("5.\tQuit");
    }

    public void showSugar(){
        System.out.println("Please, choose the sugar amount.");
        System.out.println("10");
        System.out.println("20");
        System.out.println("30");
        System.out.println("40");
    }

    public void showTopping(){
        System.out.println("Please, choose the toppings.");
        System.out.println("1.\tCinnamon.");
        System.out.println("2.\tSyrup.");
        System.out.println("3.\tNo toppings.");
    }

    public void showCup(){
        System.out.println("Please, choose the cup size.");
        System.out.println("1.\tStandart - 200 ml.");
        System.out.println("2.\tLarge - 400 ml.");
        System.out.println("3.\tExtra - 600 ml.");
    }

    public void open() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int oneMoreCoffeeNumber;
            do {
                Menu menu = new Menu();
                menu.show();
                int inputCoffee = Integer.parseInt(reader.readLine());
                if (inputCoffee == 5){
                    break;
                }
                else {
                    menu.showSugar();
                    int inputSugar = Integer.parseInt(reader.readLine());
                    menu.showTopping();
                    int inputTopping = Integer.parseInt(reader.readLine());
                    menu.showCup();
                    int inputCup = Integer.parseInt(reader.readLine());
                    Barista barista = new Barista();
                    Espresso coffee = new Espresso();
                    coffee = barista.makeCoffee(coffee, inputCoffee);
                    coffee.getSugar().setAmount(inputSugar);
                    barista.addTopping(coffee, inputTopping);
                    barista.setCup(coffee, inputCup);
                    System.out.println("Your coffee: " + coffee);
                    System.out.println("Do you want one more?");
                    System.out.println("1. Yes!");
                    System.out.println("2. No, thanks!");
                    oneMoreCoffeeNumber = Integer.parseInt(reader.readLine());
                }
            }while (oneMoreCoffeeNumber != 2);
            System.out.println("Good Bye!");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}