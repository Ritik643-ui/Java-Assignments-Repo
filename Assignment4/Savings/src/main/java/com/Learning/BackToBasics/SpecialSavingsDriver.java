package com.Learning.BackToBasics;

public class SpecialSavingsDriver {
    //used chatgpt to generate this code

    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.04);

        SavingsAccount saver1 = new SpecialSavings(2000.00);
        SavingsAccount saver2 = new SpecialSavings(3000.00);

        try {
            saver1.deposit(8001.00);
            saver1.withdraw(500.00);
            saver1.deposit(1000.00);

            saver2.deposit(500.00);
            saver2.withdraw(20.00);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        double balanceBefore1 = saver1.getSavingsBalance();
        double balanceBefore2 = saver2.getSavingsBalance();

        // Calls the overridden method in SpecialSavings.
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        double interest1 = saver1.getSavingsBalance() - balanceBefore1;
        double interest2 = saver2.getSavingsBalance() - balanceBefore2;

        //used chatgpt to generate the following code
        System.out.printf("Saver 1 balance before interest: $%.2f%n",
                balanceBefore1);
        System.out.printf("Interest earned: $%.2f%n", interest1);
        System.out.printf("Updated balance: $%.2f%n%n",
                saver1.getSavingsBalance());

        System.out.printf("Saver 2 balance before interest: $%.2f%n",
                balanceBefore2);
        System.out.printf("Interest earned: $%.2f%n", interest2);
        System.out.printf("Updated balance: $%.2f%n",
                saver2.getSavingsBalance());
    }
}