package com.jackey.demo2.streams;

import java.util.ArrayList;
import java.util.List;

public class Gems {
   private int capacity;
   private List<Gem> gemList;

    public Gems(int capacity) {
        this.capacity = capacity;
        gemList = new ArrayList<>(capacity);
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Gem> getGemList() {
        return gemList;
    }

    public void setGemList(List<Gem> gemList) {
        this.gemList = gemList;
    }
}
