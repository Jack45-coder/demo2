package com.jackey.demo2.assignments.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher((byte) 1, Role.PRINCIPAL, "Amit Kumar", 155000);
        Teacher teacher2 = new Teacher((byte) 2, Role.VICE_PRINCIPAL, "Priya Sharma", 135000);
        Teacher teacher3 = new Teacher((byte) 3, Role.CLASS_TEACHER, "Rajesh Singh", 75000);
        Teacher teacher4 = new Teacher((byte) 4, Role.SUBJECT_TEACHER, "Ankit Mishra", 85000);
        Teacher teacher5 = new Teacher((byte) 5, Role.HOD, "Pooja Patel", 50000);
        Teacher teacher6 = new Teacher((byte) 6, Role.ASSISTANT_PROFESSOR, "Sneha Gupta", 65000);
        Teacher teacher7 = new Teacher((byte) 7, Role.PROFESSOR, "Sneha Gupta", 95000);
        Teacher teacher8 = new Teacher((byte) 8, Role.CLASS_TEACHER, "Manoj Singh", 75000);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        teachers.add(teacher5);
        teachers.add(teacher6);
        teachers.add(teacher7);
        teachers.add(teacher8);

        Collections.sort(teachers);
        for (Teacher teacher : teachers){
            System.out.println(teacher);
        }
    }
}
