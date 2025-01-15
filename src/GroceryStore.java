package com.mycompany.simestate;

public class GroceryStore extends CommercialBuilding {
    private int affordabilityRating;
    private boolean hasPharmacy;
    private boolean hasBakery;

    public GroceryStore(String address, String id, String name, int numFloors, int maxCapacity, int affordabilityRating,
                        boolean hasPharmacy, boolean hasBakery) {
        super(address, id, name, numFloors, maxCapacity);
        this.affordabilityRating = affordabilityRating;
        this.hasPharmacy = hasPharmacy;
        this.hasBakery = hasBakery;
    }

    public int getAffordabilityRating() {
        return affordabilityRating;
    }

    public void setAffordabilityRating(int affordabilityRating) {
        this.affordabilityRating = affordabilityRating;
    }

    public boolean hasPharmacy() {
        return hasPharmacy;
    }

    public void setHasPharmacy(boolean hasPharmacy) {
        this.hasPharmacy = hasPharmacy;
    }

    public boolean hasBakery() {
        return hasBakery;
    }

    public void setHasBakery(boolean hasBakery) {
        this.hasBakery = hasBakery;
    }
}
