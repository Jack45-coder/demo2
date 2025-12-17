package com.jackey.demo2.generics;

//T stands for type - which is a generic type placeholder

public class Box<T> {
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

}
