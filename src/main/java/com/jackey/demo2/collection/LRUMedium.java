package com.jackey.demo2.collection;

import java.util.HashMap;
import java.util.*;

public class LRUMedium {
    private int size;
    private LinkedList<KVPair> list;

    private HashMap<Integer, Integer> hashMap;

    public LRUMedium(int size){
          this.size = size;
          this.list = new LinkedList<>();
          hashMap = new HashMap<>(size);
    }

    public void put(int i, int i1){
        if(hashMap.size() >= size){
            //override exiting values
            if(hashMap.containsKey((1))){
                list.removeIf(kvPair -> kvPair.key == i);
                hashMap.remove(i);
                list.removeIf(kvPair -> kvPair.key == i);
            }else {
                // write new Key
                KVPair kvPair = list.removeFirst();
                hashMap.remove(kvPair.key);
            }
        }

        list.removeIf(kvPair -> kvPair.key == i);
        list.addLast(new KVPair(i, i1));
        hashMap.put(i, i1);
    }

    public void display(){
        System.out.println(hashMap);
    }

    public int sizeOfMap(){
        return hashMap.size();
    }
}
