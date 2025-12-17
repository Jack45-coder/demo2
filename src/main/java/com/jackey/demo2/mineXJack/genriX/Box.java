package com.jackey.demo2.mineXJack.genriX;

import java.util.*;

public class Box <T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(1234);
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Jackey Kumar");

        System.out.println(integerBox.getValue());
        System.out.println(stringBox.getValue());

        List<Integer> intList = new ArrayList<>();
        intList.add(10);

        List<String> strList = new ArrayList<>();
        strList.add("Jacks");


    }
}
