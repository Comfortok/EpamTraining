package kz.epam.khassenov.lecture06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListSample {
    public static void main(String[] args) {
        {
            List<Integer> list = new LinkedList<>();
            list.add(15);
            list.add(25);
            list.add(35);
            list.add(45);
            list.add(55);
            for (ListIterator<Integer> listIterator = list.listIterator(list.size()); listIterator.hasPrevious(); ) {
                System.out.print(listIterator.previous() + " ");
            }
            System.out.println();
        }
        {
            List<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(1);
            arrayList.add(4);
            arrayList.add(0, 0);
            arrayList.add(arrayList.size(), 100);
            System.out.println("arrayList: " + arrayList);
            LinkedList<Object> linkedList = new LinkedList<>(arrayList);
            linkedList.add(1, "red");
            linkedList.removeLast();
            linkedList.addFirst("blue");
            System.out.println("linkedList from the start: ");
            ListIterator<Object> listIterator = linkedList.listIterator();
            while (listIterator.hasNext()){
                System.out.print(listIterator.next() + " ");
            }
            System.out.println();
            System.out.println("linkedList from the end: ");
            listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious()){
                System.out.print(listIterator.previous() + " ");
            }
        }
    }
}
