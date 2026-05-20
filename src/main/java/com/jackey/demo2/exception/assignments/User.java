package com.jackey.demo2.exception.assignments;

public class User {
    private String gender;
    private String name;
    private AccountType accountType;
    private BankAccount bankAccount;

    public User(String gender, String name, AccountType accountType, BankAccount account){
        this.gender = gender;
        this.name = name;
        this.accountType = accountType;
        this.bankAccount =  account;
    }

    public String toString(){
        return name + " | " + gender + " | " + accountType + " | "  + bankAccount.getAccount_number();
    }
}
