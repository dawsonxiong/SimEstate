package com.mycompany.simestate;

import java.util.*;

public abstract class ResidentialBuilding extends Place {

    // Properties of the ResidentialBuilding class
    private int numUnits; // Number of units in the building
    private int numBathrooms; // Number of bathrooms in each unit
    private int numBedrooms; // Number of bedrooms in each unit
    protected double price; // Price of the residential building
    private int parkingSpaces; // Number of parking spaces available
    private int numFloors; // Number of floors in the building
    private double surfaceArea; // Total surface area of the building
    private boolean bonus; // A flag indicating whether the building has a bonus or not

    // ArrayLists to store distances to various places from the residential building
    private ArrayList<Double> hospitals = new ArrayList<>(); // Distances to hospitals
    private ArrayList<Double> communityCentres = new ArrayList<>(); // Distances to community centres
    private ArrayList<Double> emergencyServiceStations = new ArrayList<>(); // Distances to emergency service stations
    private ArrayList<Double> elementary = new ArrayList<>(); // Distances to elementary schools
    private ArrayList<Double> secondary = new ArrayList<>(); // Distances to secondary schools
    private ArrayList<Double> postSecondary = new ArrayList<>(); // Distances to post-secondary schools
    private ArrayList<Double> malls = new ArrayList<>(); // Distances to malls
    private ArrayList<Double> groceryStores = new ArrayList<>(); // Distances to grocery stores
    private ArrayList<Double> parks = new ArrayList<>(); // Distances to parks
    private ArrayList<Double> busStops = new ArrayList<>(); // Distances to bus stops
    private ArrayList<Double> subwayStations = new ArrayList<>(); // Distances to subway stations

    // Constructor for ResidentialBuilding
    public ResidentialBuilding(String address, String id, int numUnits, int numBathrooms, int numBedrooms, double price, int parkingSpaces, int numFloors, double surfaceArea) {
        // Call the constructor of the superclass (Place)
        super(address, id, "");
        // Initialize the properties of the ResidentialBuilding
        this.numUnits = numUnits;
        this.numBathrooms = numBathrooms;
        this.numBedrooms = numBedrooms;
        this.price = price;
        this.parkingSpaces = parkingSpaces;
        this.numFloors = numFloors;
        this.surfaceArea = surfaceArea;

    }
    
    public void clearLists() {
        hospitals.clear();
        emergencyServiceStations.clear();
        elementary.clear();
        secondary.clear();
        postSecondary.clear();
        malls.clear();
        groceryStores.clear();
        parks.clear();
        busStops.clear();
        subwayStations.clear();
        
    }

    // Quick sort algorithm for sorting the ArrayList<Double> in ascending order
    public void quickSort(ArrayList<Double> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method for the quickSort algorithm
    public int partition(ArrayList<Double> arr, int low, int high) {
        // Choose the pivot element (last element in the array)
        double pivot = arr.get(high);
        int i = low - 1;
        // Iterate through the array to find elements smaller than the pivot
        for (int j = low; j < high; j++) {
            if (arr.get(j) < pivot) {
                // Increment the index of the smaller element
                i++;
                // Swap arr[i] and arr[j]
                double temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        // Swap arr[i + 1] and arr[high] to place the pivot in its correct position
        double temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    // Method to sort the ArrayLists for each category in ascending order
    public void sortDistances() {
        // Sorting the distances to hospitals in ascending order
        quickSort(hospitals, 0, hospitals.size() - 1);
        // Sorting the distances to community centres in ascending order
        quickSort(communityCentres, 0, communityCentres.size() - 1);
        // Sorting the distances to emergency service stations in ascending order
        quickSort(emergencyServiceStations, 0, emergencyServiceStations.size() - 1);
        // Sorting the distances to elementary schools in ascending order
        quickSort(elementary, 0, elementary.size() - 1);
        // Sorting the distances to secondary schools in ascending order
        quickSort(secondary, 0, secondary.size() - 1);
        // Sorting the distances to post-secondary schools in ascending order
        quickSort(postSecondary, 0, postSecondary.size() - 1);
        // Sorting the distances to malls in ascending order
        quickSort(malls, 0, malls.size() - 1);
        // Sorting the distances to grocery stores in ascending order
        quickSort(groceryStores, 0, groceryStores.size() - 1);
        // Sorting the distances to parks in ascending order
        quickSort(parks, 0, parks.size() - 1);
        // Sorting the distances to bus stops in ascending order
        quickSort(busStops, 0, busStops.size() - 1);
        // Sorting the distances to subway stations in ascending order
        quickSort(subwayStations, 0, subwayStations.size() - 1);
    }

// Method to print out the nearest locations
    public void displayNearestDistances() {
        // Displaying the distance to the nearest hospital
        System.out.println("The nearest hospital is " + hospitals.get(0) + " km away.");
        // Displaying the distance to the nearest community centre
        System.out.println("The nearest community centre is " + communityCentres.get(0) + " km away.");
        // Displaying the distance to the nearest emergency service station
        System.out.println("The nearest emergency service station is " + emergencyServiceStations.get(0) + " km away.");
        // Displaying the distance to the nearest elementary school
        System.out.println("The nearest elementary school is " + elementary.get(0) + " km away.");
        // Displaying the distance to the nearest secondary school
        System.out.println("The nearest secondary school is " + secondary.get(0) + " km away.");
        // Displaying the distance to the nearest post-secondary school
        System.out.println("The nearest post-secondary school is " + postSecondary.get(0) + " km away.");
        // Displaying the distance to the nearest mall
        System.out.println("The nearest mall is " + malls.get(0) + " km away.");
        // Displaying the distance to the nearest grocery store
        System.out.println("The nearest grocery store is " + groceryStores.get(0) + " km away.");
        // Displaying the distance to the nearest park
        System.out.println("The nearest park is " + parks.get(0) + " km away.");
        // Displaying the distance to the nearest bus stop
        System.out.println("The nearest bus stop is " + busStops.get(0) + " km away.");
        // Displaying the distance to the nearest subway station
        System.out.println("The nearest subway station is " + subwayStations.get(0) + " km away.");
    }

// Method to retrieve the distances to the nearest locations
    public String[] getNearestDistances() {
        // Creating an array to store the nearest distances
        return new String[]{
            String.valueOf(hospitals.get(0)),
            String.valueOf(communityCentres.get(0)),
            String.valueOf(emergencyServiceStations.get(0)),
            String.valueOf(elementary.get(0)),
            String.valueOf(secondary.get(0)),
            String.valueOf(postSecondary.get(0)),
            String.valueOf(malls.get(0)),
            String.valueOf(groceryStores.get(0)),
            String.valueOf(parks.get(0)),
            String.valueOf(busStops.get(0)),
            String.valueOf(subwayStations.get(0))
        };
    }

    // Getters and setters for the properties of ResidentialBuilding
    // Getter method to retrieve the number of units in the residential building
    public int getNumUnits() {
        return numUnits;
    }

// Setter method to set the number of units in the residential building
    public void setNumUnits(int numUnits) {
        this.numUnits = numUnits;
    }

// Getter method to retrieve the number of bathrooms in the residential building
    public int getNumBathrooms() {
        return numBathrooms;
    }

// Setter method to set the number of bathrooms in the residential building
    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

// Getter method to retrieve the number of bedrooms in the residential building
    public int getNumBedrooms() {
        return numBedrooms;
    }

// Setter method to set the number of bedrooms in the residential building
    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

// Getter method to retrieve the price of the residential building
    public double getPrice() {
        return price;
    }

// Setter method to set the price of the residential building
    public void setPrice(double price) {
        this.price = price;
    }

// Method to add a given value to the price of the residential building
    public void addPrice(double add) {
        this.price += add;
    }

// Getter method to retrieve the number of parking spaces in the residential building
    public int getParkingSpaces() {
        return parkingSpaces;
    }

// Setter method to set the number of parking spaces in the residential building
    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

// Getter method to retrieve the number of floors in the residential building
    public int getNumFloors() {
        return numFloors;
    }

// Setter method to set the number of floors in the residential building
    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

// Getter method to retrieve the surface area of the residential building
    public double getSurfaceArea() {
        return surfaceArea;
    }

// Setter method to set the surface area of the residential building
    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

// Getter method to check if the residential building has a bonus
    public boolean isBonus() {
        return bonus;
    }

// Setter method to set the bonus status of the residential building
    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    // Adding distances to the respective ArrayLists
    // Setter method to add a new double value to the hospitals ArrayList
    public void addHospitalDistance(double distance) {

        hospitals.add(distance);
    }

    // Setter method to add a new double value to the communityCentres ArrayList
    public void addCommunityCentreDistance(double distance) {
        communityCentres.add(distance);
    }

    // Setter method to add a new double value to the emergencyServiceStations ArrayList
    public void addEmergencyServiceStationDistance(double distance) {
        emergencyServiceStations.add(distance);
    }

    // Setter method to add a new double value to the schools ArrayList
    public void addElementaryDistance(double distance) {
        elementary.add(distance);
    }

    // Setter method to add a new double value to the schools ArrayList
    public void addSecondaryDistance(double distance) {
        secondary.add(distance);
    }

    // Setter method to add a new double value to the schools ArrayList
    public void addPostSecondaryDistance(double distance) {
        postSecondary.add(distance);
    }

    // Setter method to add a new double value to the malls ArrayList
    public void addMallDistance(double distance) {
        malls.add(distance);
    }

    // Setter method to add a new double value to the groceryStores ArrayList
    public void addGroceryStoreDistance(double distance) {
        groceryStores.add(distance);
    }

    // Setter method to add a new double value to the parks ArrayList
    public void addParkDistance(double distance) {
        parks.add(distance);
    }

    // Setter method to add a new double value to the busStops ArrayList
    public void addBusStopDistance(double distance) {
        busStops.add(distance);
    }

    // Setter method to add a new double value to the subwayStations ArrayList
    public void addSubwayStationDistance(double distance) {
        subwayStations.add(distance);
    }
}
