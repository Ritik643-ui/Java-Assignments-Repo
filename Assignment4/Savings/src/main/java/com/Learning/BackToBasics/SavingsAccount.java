package com.Learning.BackToBasics;

public class SavingsAccount {

    //initiaing the fields
    private static double annualInterestRate;
    private double savingsBalance;

    //public default constructor

    public SavingsAccount() {
    }


    //gets initial balance and assign it to saving balance

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }


    //getter and setters for saving balance
    protected double getSavingsBalance() {
        return savingsBalance;
    }

    protected void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    protected static double getAnnualInterestRate() {
        return annualInterestRate;
    }
//this is used to update the interest rate when we need to
    public static void modifyInterestRate(double newRate){
        annualInterestRate=newRate;

    }


    //calculates the monthly interest and updates the savings-balance
    public void calculateMonthlyInterest()
    {
        double monthlyInterest=(savingsBalance*annualInterestRate)/12.0;
        savingsBalance=savingsBalance+monthlyInterest;

    }

    //here we call this method when we have to deposit
    public void deposit(double amount){

        //just to make sure the amount is greater than 0
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        savingsBalance=savingsBalance+amount;
    }
    public void withdraw(double amount) {

        //just to make sure we only withdraw the amount lest that the balance
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be positive.");
        }

        if (amount > savingsBalance) {
            throw new IllegalArgumentException(
                    "Insufficient funds.");
        }

        savingsBalance = savingsBalance - amount;
    }


}
