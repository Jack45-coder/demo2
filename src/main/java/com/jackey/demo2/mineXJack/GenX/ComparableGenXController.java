package com.jackey.demo2.mineXJack.GenX;

import java.util.ArrayList;
import java.util.List;

public class ComparableGenXController {
    public static void print(List<? extends Number> list){
        for (Number number : list){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ComparableGenX<Integer> comparable = new ComparableGenX<>();

        Integer a = 10;
        Integer b = 20;

        int res = comparable.compare(a, b);
        System.out.println("Compare result: " + res);

        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(60);
        list.add(30);
        list.add(10);
        list.add(50);
        comparable.compare(list);
        print(list);

        ComparableGenX<Double> dblComparable = new ComparableGenX<>();
        List<Double> dblList = new ArrayList<>();
        dblList.add(10.98);
        dblList.add(34.50);
        dblList.add(76.99);
        dblList.add(12.50);
        dblList.add(3.75);
        dblComparable.compare(dblList);
        print(dblList);

    }
}
