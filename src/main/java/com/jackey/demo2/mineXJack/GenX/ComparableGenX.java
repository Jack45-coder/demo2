package com.jackey.demo2.mineXJack.GenX;

import java.util.List;

public class ComparableGenX <T extends Number & Comparable<T>>{
//    private T value;
    private List<T> value;

    public List<T> getValue() {
        return value;
    }

    public void setValue(List<T> value) {
        this.value = value;
    }

    // Compare two elements
    public int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }

    // Compare entire list and sort it ascending
    public void compare(List<T> list) {
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(compare(list.get(i), list.get(j)) > 0){
                   T temp = list.get(i);
                   list.set(i, list.get(j));
                   list.set(j, temp);
                }
            }
        }
    }
}
