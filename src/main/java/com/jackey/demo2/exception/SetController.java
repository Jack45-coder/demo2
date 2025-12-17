package com.jackey.demo2.exception;

import java.util.*;

public class SetController {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Alice");
        students.add("Alice");
        students.add("Balice");
        students.add("Calice");
        students.add("Dalice");
        students.add("Dalice");
        students.add("Malice");
        System.out.println(students);

//        Set<String> setStudent = new HashSet<>(students);
//        System.out.println(setStudent);

        Set<String> orderStudents = new LinkedHashSet<>(students);
        System.out.println(orderStudents);

        List<String> studentList = new ArrayList<>(orderStudents);
        System.out.println(studentList);

        Student studentJ = new Student(1, "Jackey", 45);
        Student studentR = new Student(2, "Rockey", 55);
        Student studentS = new Student(2, "Rockey", 45);


        // immutable or/and final keys in map
        Map<Student, String> stringMap = new HashMap<>();
        stringMap.put(studentJ, "test");
        stringMap.put(studentR, "test");
        stringMap.put(studentS, "test");

        System.out.println(stringMap);
        System.out.println(":::::::::::");

        System.out.println(stringMap.get(studentJ));
        studentJ.setRoll(3);
        System.out.println(stringMap.get(studentJ));

//        for(Map.Entry<Student, String> entry : stringMap.entrySet()){
//            System.out.println(
//                    entry.getKey() + " " + entry.getValue()
//            );
//        }

    }
}
