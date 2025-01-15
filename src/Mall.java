package com.mycompany.simestate;

public class Mall extends CommercialBuilding {
    private int numStores;
    private boolean hasMovieTheater;
    private boolean hasFoodCourt;

    public Mall(String address, String id, String name, int numFloors, int maxCapacity, int numStores,
                boolean hasMovieTheater, boolean hasFoodCourt) {
        super(address, id, name, numFloors, maxCapacity);

        this.numStores = numStores;
        this.hasMovieTheater = hasMovieTheater;
        this.hasFoodCourt = hasFoodCourt;
    }

    public int getNumStores() {
        return numStores;
    }

    public void setNumStores(int numStores) {
        this.numStores = numStores;
    }

    public boolean hasMovieTheater() {
        return hasMovieTheater;
    }

    public void setHasMovieTheater(boolean hasMovieTheater) {
        this.hasMovieTheater = hasMovieTheater;
    }

    public boolean hasFoodCourt() {
        return hasFoodCourt;
    }

    public void setHasFoodCourt(boolean hasFoodCourt) {
        this.hasFoodCourt = hasFoodCourt;
    }
}
