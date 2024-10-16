
import java.util.*;

// DijkstraAlgorithm class implements Dijkstra's algorithm to find the shortest paths from a source place to all other places
class DijkstraAlgorithm {

    // The adjacency list representing connections between places and roads
    private Map<Place, List<Road>> adjacencyList;

    // Constructor to create a new DijkstraAlgorithm instance with the given adjacency list
    public DijkstraAlgorithm(Map<Place, List<Road>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    // Method to find the shortest paths from the given source place to all other places
    public Map<Place, Integer> shortestPaths(Place source) {
        // Create a map to store distances from the source place to all other places
        Map<Place, Integer> distanceMap = new HashMap<>();

        // Initialize the distance map, setting distances to all places as maximum except the source place, which has distance 0
        for (Place place : adjacencyList.keySet()) {
            distanceMap.put(place, Integer.MAX_VALUE);
        }
        distanceMap.put(source, 0);

        // Use a priority queue to keep track of the minimum distance places
        PriorityQueue<Place> minHeap = new PriorityQueue<>(Comparator.comparingInt(distanceMap::get));
        minHeap.offer(source);

        // Perform Dijkstra's algorithm to find shortest paths
        while (!minHeap.isEmpty()) {
            Place current = minHeap.poll();
            for (Road road : adjacencyList.get(current)) {
                Place neighbor = road.getEnd();
                int newDistance = distanceMap.get(current) + road.getDistance();

                // If the new distance is smaller than the current distance to the neighbor, update the distance map
                if (newDistance < distanceMap.get(neighbor)) {
                    distanceMap.put(neighbor, newDistance);
                    minHeap.offer(neighbor);
                }
            }
        }

        return distanceMap;
    }
}
