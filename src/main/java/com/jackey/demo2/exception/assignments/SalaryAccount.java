package com.jackey.demo2.exception.assignments;

public class SalaryAccount extends BankAccount{
    public SalaryAccount(String account_holder, String account_number, double balance){
        super(account_holder, account_number, balance);
    }

//    public SalaryAccount("", "", 0){
//
//    }

    @Override
    public double withdraw(double amount) throws InsufficientBalanceException{
        if(amount > getBalance()){
            throw new InsufficientBalanceException("Insufficient Balance.");
        }
        setBalance(getBalance() - amount);

        return getBalance();
    }

    @Override
    public double deposit(double amount) throws InvalidAmountException{
        if (amount <= 0){
            throw new InvalidAmountException("Deposit amount must be greater than 0");
        }
        setBalance(getBalance() + amount);
        return getBalance();
    }
}
