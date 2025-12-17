package com.jackey.demo2.collection;

import java.util.Stack;

public class StackController {
    public static void main(String[] args) {
        // the use of stack is not recommended in java as it is a legacy class.
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top Element: " + stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);


        // for stack implementation, it is recommended to use Deque interface with ArrayDeque class:

    }
}
