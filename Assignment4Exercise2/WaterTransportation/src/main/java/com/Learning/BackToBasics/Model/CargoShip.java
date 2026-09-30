package com.Learning.BackToBasics.Model;

public class CargoShip extends Ship{

    private String cargoType,loadingMethod;
    private int numberOfCranes;
    private boolean contraband;
    private double cargoValue;

    public CargoShip() {
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getLoadingMethod() {
        return loadingMethod;
    }

    public void setLoadingMethod(String loadingMethod) {
        this.loadingMethod = loadingMethod;
    }

    public int getNumberOfCranes() {
        return numberOfCranes;
    }

    public void setNumberOfCranes(int numberOfCranes) {
        this.numberOfCranes = numberOfCranes;
    }

    public boolean isContraband() {
        return contraband;
    }

    public void setContraband(boolean contraband) {
        this.contraband = contraband;
    }

    public double getCargoValue() {
        return cargoValue;
    }

    public void setCargoValue(double cargoValue) {
        this.cargoValue = cargoValue;
    }

    public CargoShip(boolean floating, int capacity, double length, double width, double height, String name, String origin, String owner, String departureDate, String arrivalDate, String departingPort, String arrivalPort, String cargoType, String loadingMethod, int numberOfCranes, boolean contraband, double cargoValue) {
        super(floating, capacity, length, width, height, name, origin, owner, departureDate, arrivalDate, departingPort, arrivalPort);
        this.cargoType = cargoType;
        this.loadingMethod = loadingMethod;
        this.numberOfCranes = numberOfCranes;
        this.contraband = contraband;
        this.cargoValue = cargoValue;
    }

    @Override
    public void print(){
    super.print();
    //chatgpt generate
        System.out.printf("Cargo type: %s%n", cargoType);
        System.out.printf("Loading method: %s%n", loadingMethod);
        System.out.printf("Number of cranes: %d%n", numberOfCranes);
        System.out.printf("Contraband: %b%n", contraband);
        System.out.printf("Cargo value: $%.2f%n", cargoValue);
    }
}
