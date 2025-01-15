package com.mycompany.simestate;

public abstract class InstitutionalBuilding extends Place {    
    private int sustainabilityRating;
    private int numFloors;
    
    public InstitutionalBuilding(String address, String id, String name, int sustainabilityRating, int numFloors) {
        super(address, id, name);
        this.sustainabilityRating = sustainabilityRating;
        this.numFloors = numFloors;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public int getSustainabilityRating() {
        return sustainabilityRating;
    }

    public void setSustainabilityRating(int sustainabilityRating) {
        this.sustainabilityRating = sustainabilityRating;
    }
}
