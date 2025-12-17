package com.jackey.demo2.mineXJack.collecX;

import java.util.*;

public class EmployeeController {
    public static void main(String[] args) {
//        List<Employee> list = new ArrayList<>();
//
//        list.add(new Employee("Jack", 15000, "Technical"));
//        list.add(new Employee("Rajesh", 18000, "Computer"));
//        list.add(new Employee("Dinesh", 25000, "Accountant"));
//        list.add(new Employee("Abhinandan", 20000, "IT"));

//
//        Collections.sort(list, salaryComparator);
//
//        for(Employee emp : list){
//            System.out.println(emp.getName()+ " " + emp.getSalary()+ " " + emp.getBranch());
//        }

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(101, new Employee("Roshan", 45000, "Tech"));
        employeeMap.put(102, new Employee("Ramesh", 35000, "IT"));
        employeeMap.put(103, new Employee("Ananya", 35000, "Accountant"));
        employeeMap.put(104, new Employee("Shubham", 25000, "Technical"));
        employeeMap.put(105, new Employee("Rishi", 40000, "IT" ));

        Comparator<Employee> salaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp2.getSalary(), emp1.getSalary());
            }
        };

        Comparator<Employee> nameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.compareTo(o2);
            }
        };

        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(salaryComparator.thenComparing(nameComparator)))
                .forEach(entry -> {
                    Integer id = entry.getKey();
                    Employee emp = entry.getValue();

                    System.out.println(id + " " + emp.getName() + " " + emp.getBranch() + " " + emp.getSalary());
                });


    }
}
