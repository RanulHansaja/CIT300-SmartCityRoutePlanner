import java.util.*;

public class Graph {
    private Map<String, Set<String>> adjList = new HashMap<>();

    private String normalize(String name) {
        return name.trim().toLowerCase();
    }
}
