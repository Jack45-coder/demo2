package com.jackey.demo2.generics;

// Non bounded generics
public class NonGenericsBox {

    // Compile time issue
    // type safety issue
    // class casting by user

    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
