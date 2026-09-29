package com.Learning.Generics;

import java.util.Scanner;
//name=Ritik sharma
//assignment 1 part 2
public class Runner {

    //Approximates the square root using the Babylonian method.
    public static double sqrt(long n) {
        double lastGuess = 1.0;
        double nextGuess = (lastGuess + n / lastGuess) / 2.0;

        while (Math.abs(nextGuess - lastGuess) >= 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
        }

        return nextGuess;
    }

    //Reads input and displays both square root results.
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a positive whole number: ");
        long positiveWholeNumber=scanner.nextLong();

        //we are calling the custom method to calculate square root
        double resultWithCustomFunction= sqrt(positiveWholeNumber);
        System.out.println("Approximated square root:");
        System.out.printf("%.10f",resultWithCustomFunction);

        //we are calling the built-in method of Math class to compare it with the custom method
        double builtInResult = Math.sqrt(positiveWholeNumber);
        System.out.println("\nMath.sqrt() result:");

        System.out.printf("%.10f%n", builtInResult);
        scanner.close();

    }

}