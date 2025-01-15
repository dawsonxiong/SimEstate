package com.mycompany.simestate;

/**
 * This class represents a Subway Station, a subclass of Place. A Subway Station
 * is a location where trains stop to pick up and drop off passengers.
 */
public class SubwayStation extends Place {

    private int busyRating; // A rating representing how busy the subway station is, with higher values indicating higher busyness.

    /**
     * Constructor to create a new SubwayStation object with specified
     * properties.
     *
     * @param address The address of the subway station.
     * @param id The unique identifier of the subway station.
     * @param name The name of the subway station.
     * @param busyRating A rating representing how busy the subway station is.
     */
    public SubwayStation(String address, String id, String name, int busyRating) {
        super(address, id, name);

        this.busyRating = busyRating;
    }

    /**
     * Get the busy rating of the subway station.
     *
     * @return The busy rating of the subway station.
     */
    public int getBusyRating() {
        return busyRating;
    }

    /**
     * Set the busy rating of the subway station.
     *
     * @param busyRating The busy rating of the subway station to be set.
     */
    public void setBusyRating(int busyRating) {
        this.busyRating = busyRating;
    }
}

