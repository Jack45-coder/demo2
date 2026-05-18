package com.jackey.demo2.assignments.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher((byte) 1, Role.PRINCIPAL, "Amit Kumar", 55000);
        Teacher teacher2 = new Teacher((byte) 2, Role.PRINCIPAL, "Priya Sharma", 45000);
        Teacher teacher3 = new Teacher((byte) 3, Role.PRINCIPAL, "Rajesh Singh", 75000);
        Teacher teacher4 = new Teacher((byte) 4, Role.PRINCIPAL, "Ankit Mishra", 85000);
        Teacher teacher5 = new Teacher((byte) 5, Role.PRINCIPAL, "Pooja Patel", 50000);
        Teacher teacher6 = new Teacher((byte) 6, Role.PRINCIPAL, "Sneha Gupta", 15000);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        teachers.add(teacher5);
        teachers.add(teacher6);

        Collections.sort(teachers);
        for (Teacher teacher : teachers){
            System.out.println(teacher);
        }
    }
}
