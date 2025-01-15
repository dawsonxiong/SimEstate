package com.mycompany.simestate;

public class Apartment extends ResidentialBuilding {

    private static final double PRICE_PER_SQ_FT = 502; // Price per square foot, for a condo
    private static final double BATHROOM_PRICE = 20000.0; // Price per square foot, for a condo
    private static final double BEDROOM_PRICE = 20000.0; // Price per square foot, for a condo

    private boolean hasPool;
    private boolean hasGym;
    private boolean hasTennisCourt;

    public Apartment(String address, String id, int numUnits, int numBathrooms, int numBedrooms, double price, int parkingSpaces,
            int numFloors, double surfaceArea, boolean hasPool, boolean hasGym, boolean hasTennisCourt) {
        super(address, id, numUnits, numBathrooms, numBedrooms, price, parkingSpaces, numFloors, surfaceArea);

        double newPrice = calculateApartmentPrice(surfaceArea, numBathrooms, numBedrooms);
        this.setPrice(newPrice);

        this.hasPool = hasPool;
        this.hasGym = hasGym;
        this.hasTennisCourt = hasTennisCourt;
    }

    public boolean getHasGym() {
        return hasGym;
    }

    public void setHasGym(boolean hasGym) {
        this.hasGym = hasGym;
    }

    public boolean getHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public boolean getHasTennisCourt() {
        return hasTennisCourt;
    }

    public void setHasTennisCourt(boolean hasTennisCourt) {
        this.hasTennisCourt = hasTennisCourt;
    }

    public static double calculateApartmentPrice(double surfaceArea, int numBathrooms, int numBedrooms) {
        double basePrice = surfaceArea * PRICE_PER_SQ_FT;

        // Add additional fees for bathrooms and bedrooms
        double bathroomFees = numBathrooms * BATHROOM_PRICE;
        double bedroomFees = numBedrooms * BEDROOM_PRICE;

        double totalPrice = basePrice + bathroomFees + bedroomFees;
        return totalPrice;
    }
}
