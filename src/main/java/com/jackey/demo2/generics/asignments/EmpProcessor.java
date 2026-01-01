package com.jackey.demo2.generics.asignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmpProcessor {
    public static <T extends Employee> void printEmployee(List<T> employees){
        System.out.println("----: Employees :----");
         employees.stream()
                       .filter(e -> !(e instanceof Manager) && !(e instanceof Developer))
                       .forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));
        System.out.println("----: Managers :----");
         employees.stream()
                .filter(e -> e instanceof Manager)
                .forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));

         System.out.println("----: Developers :----");
         employees.stream()
                 .filter(e -> e instanceof Developer)
                 .forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));

       }

    public static void addEmployee(List<? super Employee> employees){
       employees.add(new Employee("Jack", 34000.00));
       employees.add(new Manager("Rohit",75000.00));
       employees.add(new Developer("Mukul", 85000.00));
    }

    public static void main(String[] args) {
         List<Employee> employeeList = new ArrayList<>();

         employeeList.add(new Employee("Jockey", 25000.00));
         employeeList.add(new Developer("Satya", 60000.00));
         employeeList.add(new Employee("Piyush", 45000.00));
         employeeList.add(new Employee("Amar", 35000.00));
         employeeList.add(new Developer("Rakesh", 65000.00));
         employeeList.add(new Manager("Vickey", 55000.00));
         employeeList.add(new Employee("Brajesh", 45000.00));
         employeeList.add(new Manager("Rinko", 68000.00));


         Predicate<Employee> salaryPredict = employee -> employee.getSalary() >= 25000;
         Consumer<Employee> print = employee -> System.out.println(employee.getName() + " " + employee.getSalary());

        Comparator<Employee> salaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary().compareTo(o1.getSalary());
            }
        };


        addEmployee(employeeList);
        Collections.sort(employeeList, salaryComparator);
        printEmployee(employeeList);

//         employeeList.stream()
//                 .filter(salaryPredict)
//                 .sorted(salaryComparator)
//                 .forEach(print);
    }
}
