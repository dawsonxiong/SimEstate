package com.mycompany.simestate;

// House class represents a type of ResidentialBuilding that is a single-family house
public class House extends ResidentialBuilding {

    // Constants to define pricing factors
    private static final double PRICE_PER_SQ_FT = 393; // Price per square foot, averaged between a fully detached and semi-detached home
    private static final double BATHROOM_PRICE = 20000.0; // Additional price per bathroom
    private static final double BEDROOM_PRICE = 30000.0; // Additional price per bedroom
    private static final double GARAGE_PRICE = 40000.0; // Additional price for having a garage
    private static final double BACKYARD_PRICE_PER_SQ_FT = 100; // Price per square foot for the backyard

    // Backyard size of the house
    private double backyardSize;

    // Constructor to create a new House object
    public House(String address, String id, double backyardSize, int numBathrooms, int numBedrooms, double price, int parkingSpaces, int numFloors, double surfaceArea) {
        // Call the constructor of the superclass (ResidentialBuilding)
        super(address, id, 1, numBathrooms, numBedrooms, price, parkingSpaces, numFloors, surfaceArea);
        // Calculate the house price based on its features
        double newPrice = calculateHousePrice(surfaceArea, numBathrooms, numBedrooms, parkingSpaces, backyardSize);
        // Set the calculated price for the house
        this.setPrice(newPrice);
        // Set the backyard size of the house
        this.backyardSize = backyardSize;
    }

    // Getter method to retrieve the backyard size of the house
    public double getBackyardSize() {
        return backyardSize;
    }

    // Setter method to update the backyard size of the house
    public void setBackyardSize(double backyardSize) {
        this.backyardSize = backyardSize;
    }

    // Static method to calculate the price of the house based on its features
    public static double calculateHousePrice(double surfaceArea, int numBathrooms, int numBedrooms, int numParkingSpaces, double backyardSize) {
        // Calculate the base price of the house based on its surface area
        double basePrice = surfaceArea * PRICE_PER_SQ_FT;

        // Add additional fees for bathrooms and bedrooms
        double bathroomFees = numBathrooms * BATHROOM_PRICE;
        double bedroomFees = numBedrooms * BEDROOM_PRICE;

        // Add additional fee for having a garage
        double garageFees = (numParkingSpaces >= 2) ? GARAGE_PRICE : 0.0;

        // Add additional fee for the backyard size
        double backyardFees = backyardSize * BACKYARD_PRICE_PER_SQ_FT;

        // Calculate the total price of the house
        double totalPrice = basePrice + bathroomFees + bedroomFees + garageFees + backyardFees;
        return totalPrice;
    }

}
