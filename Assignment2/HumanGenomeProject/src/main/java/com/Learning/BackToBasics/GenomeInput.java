package com.Learning.BackToBasics;

import java.util.Scanner;

public class GenomeInput {
    private Scanner sc = new Scanner(System.in);

    public HumanGenome input() {
        System.out.printf("Enter genome name: ");
        String genomeName = sc.nextLine();

        System.out.printf("Enter number of genes: ");
        int numberOfGenes = sc.nextInt();

        System.out.printf("Enter number of chromosomes: ");
        int numberOfChromosomes = sc.nextInt();

        System.out.printf("Enter number of cells: ");
        long numberOfCells = sc.nextLong();
        sc.nextLine(); // Consume the newline before the next person's name

        return new HumanGenome(
                genomeName, numberOfGenes,
                numberOfChromosomes, numberOfCells);
    }

    public static void main(String[] args) {
        GenomeInput genomeInput=new GenomeInput();
        genomeInput.input().print();
        genomeInput.input().print();
        genomeInput.input().print();
        genomeInput.sc.close();
    }
}