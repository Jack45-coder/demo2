package com.jackey.demo2.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InternalSortingController {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"A", 24));
        students.add(new Student(2,"A", 21));
        students.add(new Student(3,"B", 21));
        students.add(new Student(4,"C", 45));
        students.add(new Student(5,"D", 51));
        students.add(new Student(6,"D", 51));
        students.add(new Student(7,"E", 45));
        students.add(new Student(8,"g", 32));


//        System.out.println("Before sorting: ");
//        for(Student student: students){
//        System.out.println("Name: "+ student.getName() + " Age: " +student.getAge());
//        }

//        System.out.println("After sorting:");
//
//        Collections.sort(students);
//        for(Student student : students){
//            System.out.println("Name: " +student.getName() + " Age: " +student.getAge());
//        }


        // ComparableX - class ke inside ko sorting logic. if you want to change it, you will have to change the class's compare to
        // method

        Comparator<Student> rollComarator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2){
                return o1.getRoll() - o2.getRoll();
            }
        };

        Comparator<Student> marksComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMarks() - o2.getMarks();
            }
        };

        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        System.out.println("After sorting By Name: ");
        Collections.sort(students,new MarksComparator().thenComparing(nameComparator).thenComparing(rollComarator));
        for(Student student : students){
            System.out.println("Roll no: " + student.getRoll() + ", Name: " + student.getName() + " Marks: " +student.getMarks());
        }
    }
}
