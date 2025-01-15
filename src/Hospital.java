package com.mycompany.simestate;

public class Hospital extends InstitutionalBuilding {
    private int maxCapacity;

    public Hospital(String address, String id, int sustainabilityRating, int numFloors, String name, int maxCapacity) {
        super(address, id, name, sustainabilityRating, numFloors);
        
        this.maxCapacity = maxCapacity;
    }
    
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
