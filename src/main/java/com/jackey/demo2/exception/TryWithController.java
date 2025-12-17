package com.jackey.demo2.exception;

import ch.qos.logback.core.encoder.NonClosableInputStream;

import java.util.Scanner;

public class TryWithController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try(sc){
            System.out.println("Result: "+ a/b);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurred"+ e.getMessage());
        }finally {
            sc.close();
//            int c = sc.nextInt(); // illegal state exception
            System.out.println("Finally block executed");
        }

        try(Scanner sc2 = new Scanner(System.in)){
            int x = sc2.nextInt();
            int y = sc2.nextInt();
            System.out.println(x/y);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception: "+ e.getMessage());
        }
    }
}