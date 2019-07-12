package kz.epam.khassenov.lecture06genericandcollections;

import java.util.*;

public class InheritedCollectionsSample {
    public static void main(String[] args) {
        {
            Vector vector = new Vector(3, 1);
            System.out.println("Initial size: " + vector.size());
            System.out.println("Initial capacity: " + vector.capacity());
            vector.addElement(new Integer(1));
            vector.addElement(new Integer(2));
            vector.addElement(new Integer(3));
            vector.addElement(new Integer(4));
            System.out.println("Capacity after 4 additions: " + vector.capacity());
            System.out.println("Current size: " + vector.size());
            vector.addElement(new Double(5.45));
            System.out.println("Current capacity: " + vector.capacity());
            Enumeration vEnum = vector.elements();
            System.out.println("\nElements in vector: ");
            while (vEnum.hasMoreElements()) System.out.print(vEnum.nextElement() + " ");
            System.out.println();
        }
        {
            System.out.println(checkParity("a - (b - (c - a) / (b + c) - 2)", "(", ")"));
        }
        {
            Hashtable<String, String> hashtable = new Hashtable<>();
            hashtable.put("1", "One");
            hashtable.put("2", "Two");
            hashtable.put("3", "Three");
            Collection collection = hashtable.values();
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
            collection.remove("One");
            Enumeration enumeration = hashtable.elements();
            while (enumeration.hasMoreElements()){
                System.out.println(enumeration.nextElement());
            }
            System.out.println();
        }
        {
            Properties capitals = new Properties();
            Set states;
            String key;
            capitals.put("Illinois", "Springfield");
            capitals.put("Missouri", "Jefferson City");
            capitals.put("Washington", "Olympia");
            capitals.put("California", "Sacramento");
            capitals.put("Indiana", "Indianapolis");
            states = capitals.keySet();
            Iterator iterator = states.iterator();
            while (iterator.hasNext()){
                key = (String) iterator.next();
                System.out.println("The capital of " + key + " is " + capitals.getProperty(key) + ".");
            }
            System.out.println();
        }
        {
            BitSet bitSetOne = new BitSet();
            BitSet bitSetTwo = new BitSet();
            bitSetOne.set(0);
            bitSetOne.set(2);
            bitSetOne.set(4);
            System.out.println("Length = " + bitSetOne.length()
            + ", size = " + bitSetOne.size());
            System.out.println(bitSetOne);
            bitSetTwo.set(1);
            bitSetTwo.set(2);
            System.out.println(bitSetTwo);
            bitSetOne.and(bitSetTwo);
            System.out.println("AND: " + bitSetOne);
        }
    }
    static boolean checkParity(String expression, String open, String close){
        Stack stack = new Stack();
        StringTokenizer stringTokenizer = new StringTokenizer(expression, " \t\n\r+*/-(){}", true);
        while (stringTokenizer.hasMoreTokens()){
            String tmp = stringTokenizer.nextToken();
            if (tmp.equals(open)) stack.push(open);
            if (tmp.equals(close)) stack.pop();
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}
