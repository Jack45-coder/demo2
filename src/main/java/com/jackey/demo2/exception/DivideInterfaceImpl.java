package com.jackey.demo2.exception;

public class DivideInterfaceImpl implements DivideInterface{

    public int divide(int a, int b) throws DivideByZeroException{
        try{
            return a/b;
        }catch (ArithmeticException e){
            throw new DivideByZeroException("Cannot divide by zero");
        }
    }
}
