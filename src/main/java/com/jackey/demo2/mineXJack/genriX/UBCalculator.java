package com.jackey.demo2.mineXJack.genriX;

public class UBCalculator<T extends Number> {

    public double sum(T type1, T type2){
        return type1.doubleValue() + type2.doubleValue();
    }

    public static void main(String[] args) {
        UBCalculator<Integer> intCalc = new UBCalculator<>();
        System.out.println(intCalc.sum(10, 45));

        UBCalculator<Double> dblCalc = new UBCalculator<>();
        System.out.println(dblCalc.sum(10.5, 98.67));
    }

}
