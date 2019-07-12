package kz.epam.khassenov.lecture06genericandcollections;

import java.util.*;

public class CollectionsSample {
    public static void main(String[] args) {
        {
            List<String> listOne = Arrays.asList("red", "blue", "green");
            Collections.sort(listOne);
            System.out.println(listOne);
            Collections.reverse(listOne);
            System.out.println("reverse: " + listOne);
            List<String> listTwo = Arrays.asList("greanan", "red", "yellow", "blue");
            Collections.sort(listTwo, Collections.reverseOrder());
            System.out.println("listTwo reverse: " + listTwo);
            Collections.shuffle(listTwo);
            System.out.println("ListTwo shuffle: " + listTwo);
            Collections.shuffle(listTwo, new Random(10));
            System.out.println("ListTwo shuffle random10: " + listTwo);
            Collections.shuffle(listTwo, new Random(11));
            System.out.println("ListTwo shuffle random11: " + listTwo);
        }
        {
            List<String> listOne = Arrays.asList("one", "two", "three", "four");
            List<String> listTwo = Arrays.asList("1", "2");
            Collections.copy(listOne, listTwo);
            System.out.println(listOne);
            System.out.println(Collections.disjoint(listOne, listTwo));
            List<GregorianCalendar> listThree = Collections.nCopies(5, new GregorianCalendar(1995,4,29));
        }
        {
            List<Integer> listOne = Arrays.asList(1, 2, 3, 4, 5);
            System.out.println("Index of number 3 is: " + Collections.binarySearch(listOne, 3));
            System.out.println("Index of number -1 is: " + Collections.binarySearch(listOne, -1));
            List<String> listTwo = Arrays.asList("One", "Two", "Three");
            System.out.println("Index of \"Two\" is: " + Collections.binarySearch(listTwo, "Two"));
            System.out.println("Index of \"two\" is: " + Collections.binarySearch(listTwo, "two"));
            Collections.fill(listTwo, "Zero");
            System.out.println(listTwo);
        }
        {
            String[] stringArray = {"1", "2", "3", "3", "5"};
            Collection<String> collection = Arrays.asList(stringArray);
            System.out.println(Collections.max(collection));
            System.out.println(Collections.min(collection));
            System.out.println(Collections.frequency(collection, "3"));
        }
    }
}
