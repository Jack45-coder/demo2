package com.jackey.demo2.generics;

// bounded generics - restrict the type parameter to a specific type or its subclass
// upper bounded generics
public class AnimalBoundedGenerics<T extends Animal> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
