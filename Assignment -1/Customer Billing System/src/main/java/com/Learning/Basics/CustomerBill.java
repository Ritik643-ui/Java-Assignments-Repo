package com.Learning.Basics;

/*
 * Name:Ritik Sharma
 * Class: CIS 35A
 * Assignment: Lab -1, Project 1
 * Due Date:26th sept
 * Date Submitted:21st sept
 *
 *
 * Description: Customer billing system for five products.
 *              Reads quantities, calculates totals, applies
 *              sales tax, and prints a formatted receipt.
 */
import java.util.Scanner;


public class CustomerBill {

    public static void main(String[] args)
    {




        // Constants — unit prices and tax rate
        final double PRICE_TV             = 400.00;
        final double PRICE_VCR            = 220.00;
        final double PRICE_REMOTE         = 35.20;
        final double PRICE_CD             = 300.00;
        final double PRICE_TAPE           = 150.00;
        final double TAX_RATE             = 0.0825;

        // 1. Create Scanner
        Scanner scanner=new Scanner(System.in);
        // 2. Prompt user and read quantities
        System.out.printf("How many TVs were sold? ");
        int noOfTv = scanner.nextInt();

        System.out.printf("How many VCRs were sold? ");
        int noOfVCR = scanner.nextInt();

        System.out.printf("How many Remote Controllers were sold? ");
        int noOfRemote = scanner.nextInt();

        System.out.printf("How many CD Players were sold? ");
        int noOfCD = scanner.nextInt();

        System.out.printf("How many Tape Recorders were sold? ");
        int noOfTape = scanner.nextInt();
        // 3. Calculate total price for each item
        double totalTv = noOfTv * PRICE_TV;
        double totalVCR=noOfVCR * PRICE_VCR;
        double totalRemote=noOfRemote * PRICE_REMOTE;
        double totalCD=noOfCD*PRICE_CD;
        double totalTape=noOfTape*PRICE_TAPE;


        // 4. Calculate subtotal, tax, and total

        double subTotal=totalTv+totalVCR+totalRemote+totalCD+totalTape;

        double tax=subTotal*TAX_RATE;

        double total=subTotal+ tax;

        // 5. Print formatted receipt

        System.out.printf("==========================================================%n");
        System.out.printf("%5s   %-20s %11s %11s%n",
                "QTY", "DESCRIPTION", "UNIT PRICE", "TOTAL PRICE");
        System.out.printf("----------------------------------------------------------%n");


        System.out.printf("%5d   %-20s $%10.2f $%10.2f%n",
                noOfTv, "TV", PRICE_TV, totalTv);
        System.out.printf("%5d   %-20s $%10.2f $%10.2f%n",
                noOfTv, "VCR", PRICE_VCR, totalVCR);
        System.out.printf("%5d   %-20s $%10.2f $%10.2f%n",
                noOfTv, "Remote", PRICE_REMOTE, totalRemote);
        System.out.printf("%5d   %-20s $%10.2f $%10.2f%n",
                noOfTv, "CD", PRICE_CD, totalCD);
        System.out.printf("%5d   %-20s $%10.2f $%10.2f%n",
                noOfTv, "Taper", PRICE_TAPE, totalTape);
        System.out.printf("------------------------------------------------------------%n");

        System.out.printf("%40s $%10.2f%n", "SUBTOTAL:", subTotal);
        System.out.printf("%40s $%10.2f%n", "Tax: ",tax);
        System.out.printf("%40s $%10.2f%n","Total: ",total);

        System.out.println("=============================================================");



    }
}