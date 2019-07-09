package kz.epam.khassenov.practice07chess;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class BeanCount {
    public static void main(String[] args) {
        BigDecimal beanCount = new BigDecimal(1);
        for (int i = 1; i < 64; i++){
            beanCount = beanCount.add(BigDecimal.valueOf(Math.pow(2, i)));
        }
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        String stringNumber = numberFormat.format(beanCount);
        System.out.println(stringNumber + " beans");
        BigDecimal beanWeight = new BigDecimal(String.valueOf(beanCount.multiply(BigDecimal.valueOf(0.00000013))));
        String stringWeight = numberFormat.format(beanWeight);
        System.out.println(stringWeight + " tn.");
    }
}