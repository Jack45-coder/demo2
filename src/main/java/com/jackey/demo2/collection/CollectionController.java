package com.jackey.demo2.collection;

import java.util.*;

public class CollectionController {
    public static void main(String[] args) {

//        Set<String> studentNames = new HashSet<>();
//
//        System.out.println(studentNames);
//
//
//        Set<Student> studentSet = new HashSet<>();
//        Student student1 = new Student("Ayush", "Java", true);
//        Student student2 = new Student("Ayush", "Java", true);
//
//        studentSet.add(student1);
//        studentSet.add(student2);
//
//
//        System.out.println(studentSet.size());
//
//        for(Student student : studentSet){
//            System.out.println("Student Name: " + student.getName() + ", Batch: "+ student.getBatch() + ", Present: "+ student.isPresent());
//        }

        List<Student> studentListFour = new ArrayList<>();
        studentListFour.add(new Student("Jackey", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 04)));
        studentListFour.add(new Student("Ankit", "k4", false, "897635222", new Date(2025, Calendar.NOVEMBER, 04)));
        studentListFour.add(new Student("Aman", "k2", true, "897635222", new Date(2025, Calendar.NOVEMBER, 04)));
        studentListFour.add(new Student("Rajesh", "k3", true, "897635222", new Date(2025, Calendar.NOVEMBER, 04)));
        studentListFour.add(new Student("Mohan", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 04)));
        studentListFour.add(new Student("Komal", "k2", false, "897635222", new Date(2025, Calendar.NOVEMBER, 04)));
        studentListFour.add(new Student("Shivani", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 04)));
        studentListFour.add(new Student("Shivam", "k1", false, "897635222", new Date(2025, Calendar.NOVEMBER, 04)));
        studentListFour.add(new Student("Satyam", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 04)));
        studentListFour.add(new Student("Amar", "k3", true, "897635222", new Date(2025, Calendar.NOVEMBER, 04)));

        List<Student> studentListFive = new ArrayList<>();
        studentListFive.add(new Student("Jackey", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 05)));
        studentListFive.add(new Student("Ankit", "k4", false, "897635222", new Date(2025, Calendar.NOVEMBER, 05)));
        studentListFive.add(new Student("Aman", "k2", true, "897635222", new Date(2025, Calendar.NOVEMBER, 05)));
        studentListFive.add(new Student("Rajesh", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 05)));
        studentListFive.add(new Student("Mohan", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 05)));
        studentListFive.add(new Student("Komal", "k2", false, "897635222", new Date(2025, Calendar.NOVEMBER, 05)));
        studentListFive.add(new Student("Shivani", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 05)));
        studentListFive.add(new Student("Shivam", "k1", false, "897635222", new Date(2025, Calendar.NOVEMBER, 05)));
        studentListFive.add(new Student("Satyam", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 05)));
        studentListFive.add(new Student("Amar", "k3", true, "897635222", new Date(2025, Calendar.NOVEMBER, 05)));

        List<Student> studentListSeven = new ArrayList<>();
        studentListSeven.add(new Student("Jackey", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 07)));
        studentListSeven.add(new Student("Ankit", "k4", false, "897635222", new Date(2025, Calendar.NOVEMBER, 07)));
        studentListSeven.add(new Student("Aman", "k2", true, "897635222", new Date(2025, Calendar.NOVEMBER, 07)));
        studentListSeven.add(new Student("Rajesh", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 07)));
        studentListSeven.add(new Student("Mohan", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 07)));
        studentListSeven.add(new Student("Komal", "k2", false, "897635222", new Date(2025, Calendar.NOVEMBER, 07)));
        studentListSeven.add(new Student("Shivani", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 07)));
        studentListSeven.add(new Student("Shivam", "k1", false, "897635222", new Date(2025, Calendar.NOVEMBER, 07)));
        studentListSeven.add(new Student("Satyam", "k4", true, "897635222", new Date(2025, Calendar.NOVEMBER, 07)));
        studentListSeven.add(new Student("Amar", "k3", true, "897635222", new Date(2025, Calendar.NOVEMBER, 07)));

        Map<Date, List<Student>> attendanceMap = new HashMap<>();

        attendanceMap.put(new Date(2025, Calendar.NOVEMBER, 4), studentListFour);

        Date date = new Date(2025, Calendar.NOVEMBER, 4);

        List<Student> todayStudents = attendanceMap.get(date);

        System.out.println("Students present on "+ date +";");
        for(Student stu : todayStudents){
            if(stu.isPresent()){
                System.out.println(stu.getName());
            }
        }
    }
}
