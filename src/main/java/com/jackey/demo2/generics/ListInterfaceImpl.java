package com.jackey.demo2.generics;


import java.util.List;

public class ListInterfaceImpl implements ListInterface{

    @Override
    public void addNumbers(List<? super Number> list){
        list.add(10);
        list.add(23.8f);
        list.add(30L);
        list.add((short)30);
        list.add((double)45.87);
    }
}
