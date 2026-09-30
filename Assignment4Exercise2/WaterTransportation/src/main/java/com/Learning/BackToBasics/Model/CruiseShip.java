package com.Learning.BackToBasics.Model;

public class CruiseShip extends Ship{
    private double ticketPrice	;
    private int numberOfRooms;
    private String buffetMenu;
    private String[] services;
    private String cruiseType;

   public CruiseShip() {

    }

    public CruiseShip(boolean floating, int capacity, double length,
                      double width, double height, String name,
                      String origin, String owner, String departureDate,
                      String arrivalDate, String departingPort, String arrivalPort,
                      double ticketPrice, int numberOfRooms, String buffetMenu,
                      String[] services, String cruiseType) {
        super(floating, capacity, length, width, height, name, origin, owner, departureDate, arrivalDate, departingPort, arrivalPort);
        this.ticketPrice = ticketPrice;
        this.numberOfRooms = numberOfRooms;
        this.buffetMenu = buffetMenu;
        this.services = services;
        this.cruiseType = cruiseType;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getBuffetMenu() {
        return buffetMenu;
    }

    public void setBuffetMenu(String buffetMenu) {
        this.buffetMenu = buffetMenu;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }

    public String getCruiseType() {
        return cruiseType;
    }

    public void setCruiseType(String cruiseType) {
        this.cruiseType = cruiseType;
    }

    @Override
    //used chatgpt to generate the code
    public void print() {
        super.print();
        System.out.printf("Ticket price: $%.2f%n", ticketPrice);
        System.out.printf("Number of rooms: %d%n", numberOfRooms);
        System.out.printf("Buffet menu: %s%n", buffetMenu);
        System.out.printf("Cruise type: %s%n", cruiseType);

        System.out.printf("Services:%n");
        if (services != null) {
            for (String service : services) {
                System.out.printf("- %s%n", service);
            }
        }
    }
}
