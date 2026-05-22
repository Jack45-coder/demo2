package com.jackey.demo2.exception.assignments;

public class AccountNumberGenerator {
    public static String generateAccountNumber(){

        int random = 100000000 + (int)(Math.random() * 1000000000);
        return "58011" + random;
    }
}
