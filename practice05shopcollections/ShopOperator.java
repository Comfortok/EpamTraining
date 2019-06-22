package kz.epam.khassenov.practice05shopcollections;

import java.util.*;

public class ShopOperator {
    protected void generateQueue(){
        List<Goods> goodsList = new ArrayList<>();
        List<Customer> customerList = new ArrayList<>();
        List<String> basketList = new ArrayList<>();
        Map<Customer, String> queueMap = new LinkedHashMap<>();
        Queue<Map.Entry<Customer,String>> queueForPayment = new LinkedList<>();
        goodsList.add(new Goods("Milk",2.10));
        goodsList.add(new Goods("Bread",0.70));
        goodsList.add(new Goods("Water",1.50));

        int randomCount = (int) ((Math.random() * 4) + 1);
        for (int i = 0; i < randomCount; i++){
            customerList.add(new Customer(i));
        }

        for (Customer customer : customerList){
            System.out.println(customer);
        }

        for (int i = 0; i < customerList.size(); i++){
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0; j < goodsList.size(); j++){
                int count = getRandomGoodsCount();
                if (count != 0){
                    stringBuffer.append("\n" + (new Basket(goodsList.get(j), count)));
                }
                else {
                }
            }
            basketList.add(String.valueOf(stringBuffer));
        }

        for (int i = 0; i < customerList.size(); i++){
            queueMap.put(customerList.get(i),basketList.get(i));
        }
        System.out.println(customerList.size() + " customer(s) in a queue...");

        for (Map.Entry<Customer, String> entry : queueMap.entrySet()){
            queueForPayment.offer(entry);
        }

        while (queueForPayment.size() > 0){
            System.out.println("Next!");
            System.out.println(queueForPayment.remove());
        }
    }
    protected static int getRandomGoodsCount(){
        return (int) (Math.random() * 3);
    }
}