package com.jackey.demo2.mineXJack.genriX;

import com.jackey.demo2.exception.Student;

import java.util.*;
public class LBWildcard {
    public static void addInteger(List<? super Integer> list){
        list.add(100);
        list.add(234);
        list.add(2345);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        addInteger(intList);
        addInteger(numberList);
        addInteger(objectList);
        Object Student = new Student(1, "Jackey", 45);
        objectList.add(Student);

        System.out.println(intList);
        System.out.println(numberList);
        System.out.println(objectList);

    }
}
