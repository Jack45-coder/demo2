package com.jackey.demo2.generics;

// Non Bounded generics
public class BoxString {
    private String value;

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
