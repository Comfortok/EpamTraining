package kz.epam.khassenov.homeworks;

import javax.swing.plaf.LabelUI;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayDivision {
    public static void main(String[] args) {
        {
            int randomLength = (int) ((Math.random() + 2) * 3);
            int[] intArray = new int[randomLength];
            for (int i = 0; i < intArray.length; i++){
                intArray[i] = (int) (Math.random() * 100);
                System.out.print(intArray[i] + " ");
            }
            int firstSum = intArray[0];
            int secondSum = intArray[intArray.length - 1];
            int i = 1;
            int j = randomLength - 2;
            while (i != j){
                if (firstSum <= secondSum){
                    firstSum = firstSum + intArray[i];
                    i++;
                } else {
                    secondSum = secondSum + intArray[j];
                    j--;
                }
            }
            System.out.println();
            System.out.println("First " + firstSum + " : " + secondSum + " Second");
            int[] firstSortedArray = new int[i];
            int[] secondSortedArray = new int[intArray.length - i];
            for (int k = 0; k < i; k++){
                firstSortedArray[k] = intArray[k];
                System.out.print(firstSortedArray[k] + " ");
            }
            System.out.println();
            for (int k = 0; k < intArray.length - i; k++){
                secondSortedArray[k] = intArray[i + k];
                System.out.print(secondSortedArray[k] + " ");
                System.out.println();
            }
            {
                List<Integer> integerList = new ArrayList<>();
                int arrayLength = (int) ((Math.random() + 2) * 4);
                for (int q = 0; q < arrayLength; q++){
                    int randomNumber = (int)((Math.random() * 5) +1);//1-2-8-11
                    integerList.add(randomNumber);
                }
                Collections.sort(integerList);
                System.out.println(integerList);
                List<Integer> firstList = new ArrayList<>();
                List<Integer> secondList = new ArrayList<>();
                firstList.add(integerList.get(arrayLength - 1));
                secondList.add(integerList.get(arrayLength - 2));
                int firstListSum = firstList.get(0);
                int secondListSum = secondList.get(0);
                for (int q = arrayLength - 3; q >= 0; q--){
                    for (int p = 0; p < firstList.size(); p++){
                        firstListSum += firstList.get(p);
                    }
                    for (int p = 0; p < secondList.size(); p++){
                        secondListSum += secondList.get(p);
                    }
                    if (firstListSum > secondListSum){
                        secondList.add(integerList.get(q));
                    }
                    else {
                        firstList.add(integerList.get(q));
                    }
                }
                System.out.println("First: " + firstList);
                System.out.println("Second: " + secondList);
            }
        }
    }
}