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
        // role compare
        int roleCompare = this.role.compareTo(other.role);

        if(roleCompare == 0){
            // 2. salary compare (high to low)
            int salaryCompare = Double.compare(other.salary, this.salary);

            if (salaryCompare == 0){
                // name compare
                return this.name.compareTo(other.name);
            }
            return salaryCompare;
        }
        return roleCompare;
    }

    public String toString(){
        return id + " | " + name + " | " + role.getRoleName() + " | " + salary;
    }
}
