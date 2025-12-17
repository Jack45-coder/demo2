package com.jackey.demo2.mineXJack.collecX;

public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    private String branch;

    Employee(String name, double salary, String branch){
        this.name = name;
        this.salary = salary;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getBranch() {
        return branch;
    }

    public int compareTo(Employee emp){
        return this.name.compareTo(emp.name);
    }
}
