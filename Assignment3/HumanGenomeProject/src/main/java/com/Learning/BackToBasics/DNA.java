package com.Learning.BackToBasics;


public class DNA {
    private NucleicAcid[] LtoRHelix;
    private NucleicAcid[] RtoLHelix;


    public DNA() {

        LtoRHelix=null;
        RtoLHelix=null;

    }

    public DNA(String strand) {
        // Allocate both arrays here.
        int size=strand.length();
        LtoRHelix = new NucleicAcid[size];
        RtoLHelix = new NucleicAcid[size];

        LtoRHelixpopulate(strand);


    }

    public void LtoRHelixpopulate(String strand) {
        // Loop through the letters here.

        for (int i = 0; i < strand.length(); i++) {
            char a = strand.charAt(i);

            switch (a) {
                case 'A':
                    LtoRHelix[i] = new NucleicAcid(
                            "Adenine", "C5H5N5", 135.13f, 1.6f);
                    RtoLHelix[i] = new NucleicAcid(
                            "Thymine", "C5H6N2O2", 126.115f, 1.223f);
                    break;

                case 'T':
                    LtoRHelix[i] = new NucleicAcid(
                            "Thymine", "C5H6N2O2", 126.115f, 1.223f);
                    RtoLHelix[i] = new NucleicAcid(
                            "Adenine", "C5H5N5", 135.13f, 1.6f);
                    break;

                case 'C':
                    LtoRHelix[i] = new NucleicAcid(
                            "Cytosine", "C4H5N3O", 111.10f, 1.55f);
                    RtoLHelix[i] = new NucleicAcid(
                            "Guanine", "C5H5N5O", 151.13f, 2.200f);
                    break;

                case 'G':
                    LtoRHelix[i] = new NucleicAcid(
                            "Guanine", "C5H5N5O", 151.13f, 2.200f);
                    RtoLHelix[i] = new NucleicAcid(
                            "Cytosine", "C4H5N3O", 111.10f, 1.55f);
                    break;

                default:
                    throw new IllegalArgumentException("Invalid DNA letter: " + a);
            }

        }
    }

    public void print(NucleicAcid[] nucleicAcids){

        for (NucleicAcid nucleicAcid: nucleicAcids){
            nucleicAcid.print();

        }


    }
    public void print() {
        System.out.printf("LtoRHelix:%n");
        print(LtoRHelix);

        System.out.printf("RtoLHelix:%n");
        print(RtoLHelix);
    }

    public void highestMolarMass() {
        float highestLeft = LtoRHelix[0].getMolarMass();
        float highestRight = RtoLHelix[0].getMolarMass();

        for (int i = 1; i < LtoRHelix.length; i++) {
            if (LtoRHelix[i].getMolarMass() > highestLeft) {
                highestLeft = LtoRHelix[i].getMolarMass();
            }

            if (RtoLHelix[i].getMolarMass() > highestRight) {
                highestRight = RtoLHelix[i].getMolarMass();
            }
        }

        System.out.printf("LtoRHelix highest molar mass: %.5f g/mol%n",
                highestLeft);
        System.out.printf("Indexes: ");
        for (int i = 0; i < LtoRHelix.length; i++) {
            if (LtoRHelix[i].getMolarMass() == highestLeft) {
                System.out.printf("%d ", i);
            }
        }

        System.out.printf("%nRtoLHelix highest molar mass: %.5f g/mol%n",
                highestRight);
        System.out.printf("Indexes: ");
        for (int i = 0; i < RtoLHelix.length; i++) {
            if (RtoLHelix[i].getMolarMass() == highestRight) {
                System.out.printf("%d ", i);
            }
        }
        System.out.printf("%n");
    }

    public void totalDensity() {
        double totalLeft = 0.0;
        double totalRight = 0.0;

        for (int i = 0; i < LtoRHelix.length; i++) {
            totalLeft += LtoRHelix[i].getDensity();
            totalRight += RtoLHelix[i].getDensity();
        }

        System.out.printf("LtoRHelix total density: %.3f g/cm3%n", totalLeft);
        System.out.printf("RtoLHelix total density: %.3f g/cm3%n", totalRight);
    }

}
