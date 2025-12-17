package com.jackey.demo2.generics;

public class BoxPencil {
    private Pencil value;

    public void setValue(Pencil value){
        this.value = value;
    }

    public Pencil getValue(){
        return value;
    }
}
