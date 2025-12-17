package com.jackey.demo2.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueController {
    public static void main(String[] args) {
        // for stack implementation it is recommended to use Deque interface with ArrayDeque class
        // thread overhead is not there in ArrayDeque as opposed to Stack class
        // access is faster in ArrayDeque

        Deque<Integer> integerDeque = new ArrayDeque<>();
        integerDeque.push(10);
        integerDeque.push(20);
        integerDeque.push(30);
//        integerDeque.push(null); // ArrayDeque does not allow null element

        System.out.println("Top Element: " + integerDeque.peek());

        System.out.println("Popped Element: " + integerDeque.pop());
        System.out.println("Popped Element: " + integerDeque.pop());

        System.out.println("Top Element: " + integerDeque.peek());
        System.out.println("Popped Element: " +integerDeque.pop());
        System.out.println("Is stack empty: " + integerDeque.isEmpty());

        // for Queue implementation , it is recommended to use Deque interface with ArrayDeque class:


        // queue implementation using linkedList
        Queue<Integer> queueUsingDeque = new ArrayDeque<>(3);
        queueUsingDeque.add(10);
        queueUsingDeque.add(20);
        queueUsingDeque.add(30);
        queueUsingDeque.add(40);


        System.out.println("Queue Head element: " + queueUsingDeque.peek());
        System.out.println("Queue Removed element: " + queueUsingDeque.remove());
        System.out.println("Queue Head element: " + queueUsingDeque.peek());
        System.out.println("Queue is Empty: " +queueUsingDeque.isEmpty());
        System.out.println(queueUsingDeque);



        Queue<Integer> queueUsingLinkedList = new LinkedList<>();
        queueUsingLinkedList.add(10); // might fail in case of exception
        queueUsingLinkedList.offer(20); // either true or false
        queueUsingLinkedList.offer(30);
        queueUsingLinkedList.offer(40);
        queueUsingLinkedList.offer(null);
        queueUsingLinkedList.offer(null);
        queueUsingLinkedList.offer(null);

        System.out.println("Queue Head element: " +queueUsingLinkedList.peek());
        System.out.println("Queue Removed element: " +queueUsingLinkedList.remove());
        System.out.println("Queue Head element: " +queueUsingLinkedList.peek());
        System.out.println("Queue Is queue empty: " +queueUsingLinkedList.isEmpty());

        System.out.println("Queue Removed element: " +queueUsingLinkedList.remove());
        System.out.println("Queue Removed element: " +queueUsingLinkedList.remove());
        System.out.println("Queue Removed element: " +queueUsingLinkedList.remove());
        System.out.println("Queue Removed element: " +queueUsingLinkedList.poll()); // poll method is returns null if queue is empty
        System.out.println("Queue Size: " + queueUsingLinkedList.size());
        // we have add and remove as well, but it is preferred to use offer and poll.





    }
}
