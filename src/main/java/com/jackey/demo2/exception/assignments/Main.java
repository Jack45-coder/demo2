package com.jackey.demo2.exception.assignments;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // =========================
        // ACCOUNT TYPE FIRST
        // =========================

        System.out.println("Choose Account Type");
        System.out.println("1 -> SAVING");
        System.out.println("2 -> CURRENT");
        System.out.println("3 -> SALARY");

        System.out.print("Enter Choice: ");
        int accChoice = sc.nextInt();

        sc.nextLine(); // buffer clear

        BankAccount account = null;
        AccountType accountType = null;

        // =========================
        // USER DETAILS
        // =========================

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();


        // =========================
        // AUTO ACCOUNT NUMBER
        // =========================

        String accNo = AccountNumberGenerator.generateAccountNumber();


         // =========================
        // DYNAMIC OBJECT CREATION
        // ========================

        switch (accChoice){
            case 1:
                accountType = AccountType.SAVING;
                account = new SavingAccount(name, accNo, balance);
                break;

            case 2:
                accountType = AccountType.CURRENT;
                account = new CurrentAccount(name, accNo, balance);
                break;

            case 3:
                accountType = AccountType.SALARY;
                account = new SavingAccount(name, accNo, balance);
                break;

            default:
                System.out.println("Invalid Account Type");
                break;
        }


        // =========================
        // USER OBJECT
        // =========================

        User user = new User(
                gender, name, accountType, account
        );

        // =========================
        // ACCOUNT CREATED
        // =========================

        System.out.println("\n==================================");
        System.out.println("ACCOUNT CREATED SUCCESSFULLY");
        System.out.println("\n==================================");

        System.out.println("Account Holder: "+ account.getAccount_holder());
        System.out.println("Account Number: "+ account.getAccount_number());
        System.out.println("Account Type: "+ accountType);
        System.out.println("Balance: "+ account.getBalance());


        // =========================
        // MENU
        // =========================

        int choice;
        do{
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1 -> Deposit");
            System.out.println("2 -> Withdraw");
            System.out.println("3 -> Check Balance");
            System.out.println("4 -> Account Details");
            System.out.println("5 -> Exist");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double depAmt = sc.nextDouble();

                    try {
                        account.deposit(depAmt);
                        System.out.println("Amount Deposited Successfully.");
                    } catch (InvalidAmountException e) {
                        throw new RuntimeException(e);
                    }
                break;

                case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withAmt = sc.nextDouble();

                    try {
                        account.withdraw(withAmt);
                    }catch (InsufficientBalanceException e){
                        System.out.println(e.getMessage());
                    }
                break;

                case 3:
                    System.out.print("Available Balance: " + account.getBalance());
                break;

                case 4:
                    System.out.println("\n===== ACCOUNT DETAILS =====");
                    System.out.println(user);
                    System.out.println("Balance: " + account.getBalance());
                    System.out.println("Account Class: " +account.getClass().getSimpleName());
                break;

                case 5:
                    System.out.println("Thank You For Using Our Bank.");
                break;

                default:
                    System.out.println("Invalid Choice.");

            }
        } while (choice != 5);

        sc.close();
    }
}
