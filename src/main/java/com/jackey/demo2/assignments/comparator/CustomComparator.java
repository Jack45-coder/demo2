package com.jackey.demo2.assignments.comparator;

import java.util.Comparator;

public class CustomComparator implements Comparator<Student> {

    // decreasing
    @Override
    public int compare(Student s1, Student s2){
        return s2.getMarks()-s1.getMarks();
    }

    // name comparator
    Comparator<Student> nameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
