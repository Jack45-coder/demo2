package com.jackey.demo2.generics.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Jackey", 10000));
        list.add(new Employee("Satyam", 900));
        list.add(new Employee("Amar", 1500));
        list.add(new Employee("Vivek", 500));

        Comparator<Employee> salaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        };

        list.sort(Comparator.comparing(e -> e.getSalary()));

        for (Employee e : list){
            System.out.println(e.getName() + " " + e.getSalary());
        }
    }
}
