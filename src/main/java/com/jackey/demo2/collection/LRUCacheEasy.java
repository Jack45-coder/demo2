package com.jackey.demo2.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheEasy {
    private int size;
    private LinkedHashMap hashMap;

    public LRUCacheEasy(int size){
        this.size = size;
        hashMap = new LinkedHashMap<>(size, 0.75f, false){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest){
                return size() > size;
            }
        };
    }

    public void  put(int i, int i1){
        hashMap.put(i, i1);
    }

    public Integer get(int i){
        return (Integer) hashMap.get(i);
    }

    public void display(){
        System.out.println(hashMap);
    }
}
