package com.jackey.demo2.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingController {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(34);
        num.add(14);
        num.add(7);
        num.add(83);

        System.out.println("Before Sorting: " +num);

//        Collections.sort(num);
        Collections.sort(num, Comparator.comparing(n -> -n));
        System.out.println(num);

        Collections.sort(num);
        System.out.println("After sorting: " +num);

        // descending Sorting:
        Collections.sort(num, Comparator.reverseOrder());
        System.out.println("Sorting by descending order: " +num);
    }
}
