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
