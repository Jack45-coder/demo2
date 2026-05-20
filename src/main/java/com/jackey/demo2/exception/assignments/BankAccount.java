package com.jackey.demo2.exception.assignments;

public abstract class BankAccount {
    private String account_number;
    private String account_holder;
    private double balance;

    public BankAccount(String account_number, String account_holder, double balance) {
        this.account_number = account_number;
        this.account_holder = account_holder;
        this.balance = balance;
    }

    public BankAccount(){

    }

    //abs -> withdrawal method
    public abstract double withdraw(double amount) throws InsufficientBalanceException;

    //abs -> deposit method
    public abstract double deposit(double amount) throws InvalidAmountException;

    public String getAccount_number() {
        return account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount){
        this.balance = amount;
    }

    public String getAccount_holder() {
        return account_holder;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setAccount_holder(String account_holder) {
        this.account_holder = account_holder;
    }
}
