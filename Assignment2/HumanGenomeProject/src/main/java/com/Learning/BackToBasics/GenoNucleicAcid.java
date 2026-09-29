package com.Learning.BackToBasics;

import java.util.Scanner;

public class GenoNucleicAcid {

private  Scanner sc=new Scanner(System.in);

    public NucleicAcid input() {
        System.out.printf("Enter name: ");
        String name = sc.nextLine();

        System.out.printf("Enter chemical formula: ");
        String chemicalFormula = sc.nextLine();

        System.out.printf("Enter molar mass (g/mol): ");
        float molarMass = sc.nextFloat();

        System.out.printf("Enter density (g/cm3): ");
        float density = sc.nextFloat();
        sc.nextLine(); // Consume the leftover newline

        return new NucleicAcid(name, chemicalFormula, molarMass, density);
    }

    public static void main(String[] args) {

        GenoNucleicAcid genoNucleicAcid=new GenoNucleicAcid();
        genoNucleicAcid.input().print();
        genoNucleicAcid.input().print();
//        genoNucleicAcid.input().print();
//        genoNucleicAcid.input().print();
//        genoNucleicAcid.input().print();
        genoNucleicAcid.sc.close();
    }

}
