/**
 * This class represents a Townhouse, a subclass of ResidentialBuilding. A
 * Townhouse is a type of residential building that is usually part of a row of
 * similar houses.
 */
public class Townhouse extends ResidentialBuilding {

    // Constants for pricing calculation
    private static final double PRICE_PER_SQ_FT = 345; // Price per square foot, for a row house (townhouse)
    private static final double BATHROOM_PRICE = 20000.0; // Additional price per bathroom
    private static final double BEDROOM_PRICE = 30000.0; // Additional price per bedroom
    private static final double GARAGE_PRICE = 40000.0; // Additional price for having a garage
    private static final double BACKYARD_PRICE_PER_SQ_FT = 100; // Price per square foot for the backyard

    private double backyardSize; // The size of the backyard in square feet.

    /**
     * Constructor to create a new Townhouse object with specified properties.
     *
     * @param address The address of the townhouse.
     * @param id The unique identifier of the townhouse.
     * @param numBathrooms The number of bathrooms in the townhouse.
     * @param numBedrooms The number of bedrooms in the townhouse.
     * @param price The base price of the townhouse.
     * @param parkingSpaces The number of parking spaces available for the
     * townhouse.
     * @param numFloors The number of floors in the townhouse.
     * @param surfaceArea The total surface area of the townhouse in square
     * feet.
     * @param backyardSize The size of the backyard in square feet.
     */
    public Townhouse(String address, String id, int numBathrooms, int numBedrooms, double price, int parkingSpaces,
            int numFloors, double surfaceArea, double backyardSize) {
        super(address, id, 1, numBathrooms, numBedrooms, price, parkingSpaces, numFloors, surfaceArea);
        this.backyardSize = backyardSize;
    }

    /**
     * Get the size of the backyard.
     *
     * @return The size of the backyard in square feet.
     */
    public double getBackyardSize() {
        return backyardSize;
    }

    /**
     * Set the size of the backyard.
     *
     * @param backyardSize The size of the backyard to be set in square feet.
     */
    public void setBackyardSize(double backyardSize) {
        this.backyardSize = backyardSize;
    }

    /**
     * Calculate the total price of the townhouse based on its surface area,
     * number of bathrooms, bedrooms, parking spaces, and backyard size.
     *
     * @param surfaceArea The total surface area of the townhouse in square
     * feet.
     * @param numBathrooms The number of bathrooms in the townhouse.
     * @param numBedrooms The number of bedrooms in the townhouse.
     * @param numParkingSpaces The number of parking spaces available for the
     * townhouse.
     * @param backyardSize The size of the backyard in square feet.
     * @return The total price of the townhouse.
     */
    public static double calculateHousePrice(double surfaceArea, int numBathrooms, int numBedrooms, int numParkingSpaces, double backyardSize) {
        double basePrice = surfaceArea * PRICE_PER_SQ_FT;

        // Add additional fees for bathrooms and bedrooms
        double bathroomFees = numBathrooms * BATHROOM_PRICE;
        double bedroomFees = numBedrooms * BEDROOM_PRICE;
        double garageFees = (numParkingSpaces >= 2) ? GARAGE_PRICE : 0.0;
        double backyardFees = backyardSize * BACKYARD_PRICE_PER_SQ_FT;

        return basePrice + bathroomFees + bedroomFees + garageFees + backyardFees;
    }
}

