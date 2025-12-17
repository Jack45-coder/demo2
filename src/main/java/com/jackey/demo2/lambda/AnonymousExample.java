package com.jackey.demo2.lambda;

public class AnonymousExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside run");
            }
        };
    }
}
