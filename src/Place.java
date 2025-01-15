package com.mycompany.simestate;

// Place is an abstract class representing a location in the city
public abstract class Place {

    // Attributes of a place
    private String address; // The address of the place
    private String id; // A unique identifier for the place
    private String name; // The name of the place

    // Constructor to create a new Place instance with the given address, ID, and name
    public Place(String address, String id, String name) {
        this.address = address;
        this.id = id;
        this.name = name;
    }

    // Method to get the name of the place
    public String getName() {
        return name;
    }

    // Method to set the name of the place
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the address of the place
    public String getAddress() {
        return address;
    }

    // Method to set the address of the place
    public void setAddress(String address) {
        this.address = address;
    }

    // Method to get the ID of the place
    public String getId() {
        return id;
    }

    // Method to set the ID of the place
    public void setId(String id) {
        this.id = id;
    }
}
