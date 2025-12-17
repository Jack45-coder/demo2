package com.jackey.demo2.collection;

import java.util.Date;

public class Student {
    private String name;
    private String batch;
    private boolean isPresent;
    private String phoneNo;
    private Date date;

    Student(String name, String batch, boolean isPresent){
        this.name = name;
        this.batch = batch;
        this.isPresent = isPresent;
    }

    Student(String name, String batch, boolean isPresent, String phoneNo, Date date){
        this.name =name;
        this.batch = batch;
        this.isPresent = isPresent;
        this.phoneNo = phoneNo;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
