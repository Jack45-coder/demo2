package com.jackey.demo2.assignments.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Rahul Kumar", 92);
        Student student2 = new Student(3, "Roshan Kumar", 91);
        Student student3 = new Student(4, "Kartik Kumar", 85);
        Student student6 = new Student(6, "Kartik Kumar", 92);
        Student student4 = new Student(2, "Prashant Kumar", 93);
        Student student5 = new Student(5, "Rubina Kaur", 74);
        Student student7 = new Student(6, "Roshan Singh", 85);


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);


        CustomComparator custom = new CustomComparator();
        studentList.sort(custom.thenComparing(custom.nameComparator));

        studentList.forEach(System.out::println);
    }
}
