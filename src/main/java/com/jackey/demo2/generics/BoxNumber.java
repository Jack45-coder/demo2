package com.jackey.demo2.generics;

// number in java
// bounded generics: restrict the tye parameter to a specific type or its subclass

public class BoxNumber<T extends Number>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
