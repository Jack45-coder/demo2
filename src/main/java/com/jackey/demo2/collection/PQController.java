package com.jackey.demo2.collection;

import com.jackey.demo2.exception.Student;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQController {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(50);
        pq.add(40);

        System.out.println("Priority Queue Head element: " + pq.peek());
        System.out.println(pq);

        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.comparing(Integer::intValue).reversed());
        pqr.add(30);
        pqr.add(10);
        pqr.add(20);
        pqr.add(50);
        pqr.add(40);

        System.out.println("Priority Queue Head element: " +pqr.peek());
        System.out.println("Priority Queue Head element remove: "+pqr.remove());
        System.out.println(pqr);

        PriorityQueue<com.jackey.demo2.exception.Student> students = new PriorityQueue<>();
        com.jackey.demo2.exception.Student student1  = new com.jackey.demo2.exception.Student(1, "Alice", 85);
        com.jackey.demo2.exception.Student student2  = new com.jackey.demo2.exception.Student(2, "Pintu", 75);
        com.jackey.demo2.exception.Student student3  = new com.jackey.demo2.exception.Student(3, "Mintu", 95);

        students.offer(student1);
        students.offer(student2);
        students.offer(student3);

            System.out.println("Top student: " + students.peek().getName() + " with score: " + students.peek().getMarks());
    }
}
