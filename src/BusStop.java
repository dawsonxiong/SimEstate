package com.mycompany.simestate;

public class BusStop extends Place {
    private int busyRating;

    public BusStop(String address, String id, String name, int busyRating) {
      super(address, id, name);
      
      this.busyRating = busyRating;
    }

    
    public int getBusyRating() {
        return busyRating;
    }

    public void setBusyRating(int busyRating) {
        this.busyRating = busyRating;
    }
}
