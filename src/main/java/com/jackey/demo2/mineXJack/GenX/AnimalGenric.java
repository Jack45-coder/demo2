package com.jackey.demo2.mineXJack.GenX;

public class AnimalGenric<T extends Animal> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
