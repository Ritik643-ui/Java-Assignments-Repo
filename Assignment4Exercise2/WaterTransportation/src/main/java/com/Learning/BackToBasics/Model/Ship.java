package com.Learning.BackToBasics.Model;

public class Ship {

    private boolean floating;
    private int capacity;
    private double length, width, height;
    private String name,origin,owner;
    private String departureDate,arrivalDate;
    private String departingPort,arrivalPort;

    //def constructor
    public Ship() {
    }

    //constructor to initiate
    public Ship(boolean floating, int capacity, double length,
                double width, double height, String name, String origin,
                String owner, String departureDate, String arrivalDate,
                String departingPort, String arrivalPort) {
        this.floating = floating;
        this.capacity = capacity;
        this.length = length;
        this.width = width;
        this.height = height;
        this.name = name;
        this.origin = origin;
        this.owner = owner;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departingPort = departingPort;
        this.arrivalPort = arrivalPort;
    }

    public boolean isFloating() {
        return floating;
    }

    public void setFloating(boolean floating) {
        this.floating = floating;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartingPort() {
        return departingPort;
    }

    public void setDepartingPort(String departingPort) {
        this.departingPort = departingPort;
    }

    public String getArrivalPort() {
        return arrivalPort;
    }

    public void setArrivalPort(String arrivalPort) {
        this.arrivalPort = arrivalPort;
    }

    //generated wuth gpt
    public void print() {
        System.out.printf("Name: %s%n", name);
        System.out.printf("Floating: %b%n", floating);
        System.out.printf("Capacity: %d people%n", capacity);
        System.out.printf("Length: %.2f metres%n", length);
        System.out.printf("Width: %.2f metres%n", width);
        System.out.printf("Height: %.2f metres%n", height);
        System.out.printf("Origin: %s%n", origin);
        System.out.printf("Owner: %s%n", owner);
        System.out.printf("Departure date: %s%n", departureDate);
        System.out.printf("Arrival date: %s%n", arrivalDate);
        System.out.printf("Departing port: %s%n", departingPort);
        System.out.printf("Arrival port: %s%n", arrivalPort);
    }
}
