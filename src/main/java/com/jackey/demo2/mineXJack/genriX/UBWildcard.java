package com.jackey.demo2.mineXJack.genriX;

import java.util.*;

public class UBWildcard <T extends Number>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void printNumbers(List<? extends Number> list){
        for(Number number : list){
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        UBWildcard<Integer> intBox = new UBWildcard<>();
        intBox.setValue(10);

        UBWildcard<Double> dblBox = new UBWildcard<>();
        dblBox.setValue(34.5);

        List<Integer> intList = new ArrayList<>();
        intList.add(intBox.getValue());

        List<Double> dblList = new ArrayList<>();
        dblList.add(dblBox.getValue());

        printNumbers(intList);
        printNumbers(dblList);


    }
}
