// Road class represents a road connecting two places
class Road {

    // The starting place of the road
    private Place start;

    // The ending place of the road
    private Place end;

    // The distance of the road in kilometers
    private int distance;

    // Constructor to create a new Road instance
    public Road(Place start, Place end, int distance) {
        this.start = start;
        this.end = end;
        this.distance = distance;
    }

    // Get the starting place of the road
    public Place getStart() {
        return start;
    }

    // Get the ending place of the road
    public Place getEnd() {
        return end;
    }

    // Get the distance of the road
    public int getDistance() {
        return distance;
    }
}
