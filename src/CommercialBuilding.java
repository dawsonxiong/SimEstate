package com.mycompany.simestate;

public class CommercialBuilding extends Place {
    private int numFloors;
    private int maxCapacity;

    public CommercialBuilding(String address, String id, String name,
                              int numFloors, int maxCapacity) {
        super(address, id, name);
        this.numFloors = numFloors;
        this.maxCapacity = maxCapacity;
    }
    
    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
