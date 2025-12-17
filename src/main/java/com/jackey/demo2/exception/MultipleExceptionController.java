package com.jackey.demo2.exception;

import java.util.Scanner;

public class MultipleExceptionController {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            throwMultipleException(sc.nextInt());
        }catch (DivideByZeroException e){
            System.out.println("Caught DivideByZeroException: "+e.getMessage());
        }catch (XException e){
            System.out.println("Caught XException: "+e.getMessage());
        }catch (YException e){
            System.out.println("Caught YException: "+e.getMessage());
        }
    }

    private static void throwMultipleException(int a) throws DivideByZeroException, XException, YException {
       switch (a){
           case 1 -> throw new DivideByZeroException("Division by zero occur");
           case 2 -> throw new XException("XException");
           case 3 -> throw new YException("YException");
       }
    }
}
