package kz.epam.khassenov.lecture06;

import java.util.*;

public class SetSample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("NY");
        set.add("LA");
        set.add("NY");
        linkedSet.addAll(set);
        System.out.println(set);
        for (String element : set){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(linkedSet);
        for (String element : linkedSet){
            System.out.print(element + " ");
        }
        System.out.println();
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);
        for (Iterator<String> iterator = treeSet.iterator(); iterator.hasNext();){
            if (iterator.next().equals("NY")){
                iterator.remove();
            }
        }
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        treeSet.removeAll(Collections.singleton("LA"));
        System.out.println(treeSet);
    }
}
