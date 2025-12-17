package com.jackey.demo2.exception;

import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) throws DivideByZeroException{
        int a = 10;
        int b = 0;
        samjhane(a,b);

    }

    static int samjhane(int a, int b) throws DivideByZeroException{
        return divide(a,b);
    }

    static int divide(int a, int b) throws DivideByZeroException{
        try{
            int res = a/b;
            System.out.println("Result: " + res);
            return res;
        }catch (ArithmeticException e){
            throw new DivideByZeroException("Cannot divide by zero");
        }
    }
}
