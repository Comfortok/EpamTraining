package kz.epam.khassenov.lecture06genericandcollections;

import java.util.*;

public class MapSample {
    public static void main(String[] args) {
        {
            Map<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Smith", 30);
            hashMap.put("Anderson", 24);
            hashMap.put("Sop", 19);
            hashMap.put("Cook", 29);
            System.out.println("hashMap: " + hashMap);
            Map<String, Integer> treeMap = new TreeMap<>(hashMap);
            System.out.println("treeMap: " + treeMap);
            Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
            linkedHashMap.put("Smith", 30);
            linkedHashMap.put("Anderson", 24);
            linkedHashMap.put("Sop", 19);
            linkedHashMap.put("Cook", 29);
            System.out.println("\nThe age for Sop is " + linkedHashMap.get("Sop").intValue());
            System.out.println("linkedHashMap: " + linkedHashMap);
        }
        {
            Properties properties = System.getProperties();
            Iterator iterator = properties.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry pair = (Map.Entry) iterator.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
    }
}
