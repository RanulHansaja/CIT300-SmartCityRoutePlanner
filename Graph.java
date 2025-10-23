import java.util.*;

public class Graph {
    private Map<String, Set<String>> adjList = new HashMap<>();

    private String normalize(String name) {
        return name.trim().toLowerCase();
    }
}
public boolean addLocation(String location) {
        location = normalize(location);
        if (adjList.containsKey(location)) return false;
        adjList.put(location, new HashSet<>());
        return true;
    }
    public boolean removeLocation(String location) {
        location = normalize(location);
        if (!adjList.containsKey(location)) return false;
        adjList.remove(location);
        for (Set<String> connections : adjList.values()) {
            connections.remove(location);
        }
        return true;
    }
    public boolean addRoad(String loc1, String loc2) {
        loc1 = normalize(loc1);
        loc2 = normalize(loc2);
        if (!adjList.containsKey(loc1) || !adjList.containsKey(loc2)) return false;
        adjList.get(loc1).add(loc2);
        adjList.get(loc2).add(loc1);
        return true;
    }
    public boolean removeRoad(String loc1, String loc2) {
        loc1 = normalize(loc1);
        loc2 = normalize(loc2);
        if (!adjList.containsKey(loc1) || !adjList.containsKey(loc2)) return false;
        adjList.get(loc1).remove(loc2);
        adjList.get(loc2).remove(loc1);
        return true;
    }
