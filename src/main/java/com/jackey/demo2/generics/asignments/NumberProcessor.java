package com.jackey.demo2.generics.asignments;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class NumberProcessor {
    public static void main(String[] args) {
        Predicate<Integer> isPos = n -> n > 0;
        Consumer<Integer> solution = n -> {
            if (n % 2 == 0){
                System.out.println(n*n);
            }else {
                System.out.println(n);
            }
        };

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(11);
        intList.add(-90);
        intList.add(23);
        intList.add(22);

        intList.stream().filter(isPos).forEach(solution);

//        if (isPos.test(num)){
//            solution.accept(num);
//        }
    }
}