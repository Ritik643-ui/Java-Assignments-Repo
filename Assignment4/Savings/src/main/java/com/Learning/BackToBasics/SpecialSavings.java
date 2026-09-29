package com.Learning.BackToBasics;

public class SpecialSavings extends SavingsAccount{

    public SpecialSavings() {
    }

    public SpecialSavings(double savingsBalance) {
        super(savingsBalance);
    }


    //this is the overriding method
    //we can annotate with @Override but meh, not really necessary as java already knows it
    public void calculateMonthlyInterest() {

        //we are checking if the saving if greater than  10000 so we can put it in special saving
       if( getSavingsBalance() > 10000){

           //for special saving we use 10% as its interest and update total savings
           double monthlyInterest = getSavingsBalance() * (0.10 / 12.0);
           setSavingsBalance(getSavingsBalance() + monthlyInterest);


       }
       else super.calculateMonthlyInterest();

    }
}
