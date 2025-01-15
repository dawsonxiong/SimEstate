package com.mycompany.simestate;

public class EmergencyServiceStation extends InstitutionalBuilding {
    private String type;

    public EmergencyServiceStation(String address, String id, String name, int sustainabilityRating, int numFloors, String type) {
        super(address, id, name, sustainabilityRating, numFloors);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
