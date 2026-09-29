package com.Learning.Basics;

import java.util.Scanner;

/*
 * Name:Ritik Sharmma
 * Class: CIS 35A
 * Assignment: Lab -1, Project 2
 * Due Date:sept 26
 * Date Submitted:sept21
 *
 * Description: Converts temperatures between Celsius and
 *              Fahrenheit in both directions based on user input.
 */
public class TemperatureConverter {

    TempConverter ctf = c -> 32 + c * (180.0 / 100.0);
    TempConverter ftc= f -> (f - 32) * (100.0 / 180.0);

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TemperatureConverter convert=new TemperatureConverter();

        System.out.println("Enter temperature in celsius");
        double tempInCelsius = scanner.nextDouble();
        System.out.printf("%.2f\u00B0C = %.2f\u00B0F%n",
                tempInCelsius, convert.ctf.convert(tempInCelsius));

        System.out.println("Enter temperature in Fahrenheit ");
        double tempInFahrenheit = scanner.nextDouble();
        scanner.close();
        System.out.printf("%.2f\u00B0F = %.2f\u00B0C%n",
                tempInFahrenheit, convert.ftc.convert(tempInFahrenheit));

    }


}

interface TempConverter {

    public double convert(double c);
}

