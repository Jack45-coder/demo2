package com.jackey.demo2.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface DivideInterface{
    int divide(int a, int b) throws DivideByZeroException;


    class SortingController {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();

            numbers.add(1);
            numbers.add(12);
            numbers.add(34);
            numbers.add(4);
            numbers.add(51);

            System.out.println("Before Sorting: " + numbers);

            Collections.sort(numbers);
            System.out.println("After sorting: " + numbers);

            Collections.sort(numbers, Comparator.reverseOrder());
            System.out.println(numbers);

        }
    }
}
