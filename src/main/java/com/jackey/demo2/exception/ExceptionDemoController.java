package com.jackey.demo2.exception;

import java.util.Scanner;

public class ExceptionDemoController {
    public static void main(String[] args) {
        System.out.println("Exception Demo controller");
        // Unchecked Exception => this is the exception which is not checked at compile time.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int d = sc.nextInt();
        int c = 0;
        try{
            int a = 10, b = 0;
            c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Executed Program successfully");
        }
        System.out.println("Programme continues...");
        System.out.println("Magic Number: " + (d+c));
    }
}
