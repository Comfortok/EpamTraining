package kz.epam.khassenov.lecture06;

import java.util.*;

public class EnumCollectionsSample {
    enum Faculty {
        ABC, DEF, GHI, KLM, NOP
    }

    enum Size {
        S, M, L, XL, XXL, XXXL;
    }

    public static void main(String[] args) {
        EnumSet<Faculty> setOne = EnumSet.range(Faculty.ABC, Faculty.KLM);
        EnumSet<Faculty> setTwo = EnumSet.complementOf(setOne);
        System.out.println("setOne: " + setOne);
        System.out.println("setTwo: " + setTwo);
        System.out.println();
        EnumMap<Size, String> enumMap = new EnumMap<Size, String>(Size.class);
        enumMap.put(Size.S, "Small");
        enumMap.put(Size.M, "Medium");
        enumMap.put(Size.L, "Large");
        enumMap.put(Size.XL, "x1 Large");
        enumMap.put(Size.XXL, "x2 Large");
        enumMap.put(Size.XXXL, "x3 Large");
        for (Size size : Size.values()){
            System.out.println(size + " : " + enumMap.get(size));
        }
        Iterator iterator = enumMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
