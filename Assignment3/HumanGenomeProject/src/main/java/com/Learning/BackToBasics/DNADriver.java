package com.Learning.BackToBasics;

public class DNADriver {
    public static void main(String[] args) {
        String[] strands = {
                "AGCCTAGGATCAG",
                "AGCCTAGGATCTAGGATCAG",
                "AGCCTATAGGATCAG",
                "AAAGCCTAGGATAGGATCAG",
                "AAAGCCTCTGAGGATAGGATCAG"
        };

        for (String strand : strands) {
            System.out.printf("%n========================================%n");
            System.out.printf("Input strand: %s%n", strand);
            System.out.printf("========================================%n");

            DNA dna = new DNA(strand);
            dna.print();
            dna.highestMolarMass();
            dna.totalDensity();
        }
    }
}