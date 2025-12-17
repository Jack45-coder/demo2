package com.jackey.demo2.exception;

import java.util.Objects;

public class Student implements Comparable<Student>{
    int roll;
    String name;
    int marks;


    public Student(int roll, String Oname, int Omarks) {
        this.roll = roll;
        this.name = Oname;
        this.marks = Omarks;
    }

    public int getRoll(){
        return roll;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public void setRoll(int id){
        this.roll = id;
    }

    @Override
    public int compareTo(Student o) {
        // asc order sorting by age
        return this.marks - o.marks;

        // dsc order sorting by age
//        return o.marks - this.marks ;
    }

//    public String compare(Student o){
//        return this.name - o.name;
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll);
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

