package com.jackey.demo2.assignments.comparable;

public class Teacher implements Comparable<Teacher> {
    private byte id;
    private Role role;
    private String name;
    private double salary;


    Teacher(byte id, Role role, String name, double salary){
        this.id = id;
        this.role = role;
        this.name = name;
        this.salary = salary;
    }


    public int compareTo(Teacher other){
        return Double.compare(other.salary, this.salary);
    }

    public String toString(){
        return id + " | " + name + " | " + role.getRoleName() + " | " + salary;
    }
}
