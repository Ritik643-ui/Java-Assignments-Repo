package com.Learning.BackToBasics;

public class HumanGenome {
    private String genomeName;
    private int noOfGenes;
    private int noOfChromosome;
    private long noOfCells;

    public HumanGenome() {
    }

    public HumanGenome(String genomeName, int noOfGenes, int noOfChromosome, long noOfCells) {
        this.genomeName = genomeName;
        this.noOfGenes = noOfGenes;
        this.noOfChromosome = noOfChromosome;
        this.noOfCells = noOfCells;
    }

    public String getGenomeName() {
        return genomeName;
    }

    public void setGenomeName(String genomeName) {
        this.genomeName = genomeName;
    }

    public int getNoOfGenes() {
        return noOfGenes;
    }

    public void setNoOfGenes(int noOfGenes) {
        this.noOfGenes = noOfGenes;
    }

    public int getNoOfChromosome() {
        return noOfChromosome;
    }

    public void setNoOfChromosome(int noOfChromosome) {
        this.noOfChromosome = noOfChromosome;
    }

    public long getNoOfCells() {
        return noOfCells;
    }

    public void setNoOfCells(long noOfCells) {
        this.noOfCells = noOfCells;
    }

    public void print(){

        System.out.printf("Genome name: %s%nNumber of genes: %d%nNumber of chromosomes: %d%nNumber of cells: %d%n",
                genomeName, noOfGenes, noOfChromosome, noOfCells);    }
}
