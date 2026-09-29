package com.Learning.Generics;


import java.util.Scanner;

//Name-Ritik Sharma
//assignment1 LoanAmortization
public class LoanAmortization {

    //using the formula of monthly payments to calculate monthly payments
    public static double computeMonthlyPayment(double loanAmount, double monthlyInterestRate, int n)
    {
        return (loanAmount*monthlyInterestRate*Math.pow(1 + monthlyInterestRate, n))/(Math.pow(1 + monthlyInterestRate, n)-1);
    }

    //looping through each row in of the given array
    public static void printingMethod(double[][] array){


        System.out.printf("%-10s %12s %12s %12s%n",
                "Payment#", "Interest", "Principal", "Balance");
        for(double[] value: array){

            System.out.printf("%-10d %12.2f %12.2f %12.2f%n",
                    (int) value[0], value[1], value[2], value[3]);
        }

    }

// using loop to calculate each row of the schedule
    public static double[][] amortizationSchedule(double balance, double monthlyRate, double monthlyPayment, int numberOfPayments){


        double[][] list=new double[numberOfPayments][4];

        for(int payment=1;payment<=numberOfPayments;payment++)
        {double interest=monthlyRate*balance;
            double principal=monthlyPayment-interest;
            balance=balance-principal;
            if((payment==numberOfPayments) &&  balance>0){

                monthlyPayment=monthlyPayment+balance;
                principal=principal+balance;
                balance=0.0;
            }

            list[payment - 1][0] = payment;
            list[payment -1 ][1]= interest;
            list[payment -1][2]=principal;
            list[payment -1][3]=balance;




        }
        return list;


    }


//just the main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double loanAmount;
        int numberOfYears;
        double apr;

        System.out.println("Enter Loan Amount");
        loanAmount=sc.nextDouble();
        System.out.println("Enter number of years");
        numberOfYears=sc.nextInt();
        System.out.println("Enter annual rate of interest");
        apr=(sc.nextDouble())/100.0;
        sc.close();
        double monthlyInterestRate=apr/12.0;
        int numberOfPayments=numberOfYears*12;

        //using the method to compute monthly payments
        double monthlyPayment=computeMonthlyPayment(loanAmount,monthlyInterestRate,numberOfPayments);

        double totalPayment=monthlyPayment*numberOfPayments;

        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
        System.out.printf("Total Payment: %.2f%n", totalPayment);


        double[][] schedule=amortizationSchedule(loanAmount,monthlyInterestRate,monthlyPayment,numberOfPayments);

        printingMethod(schedule);




    }

}
