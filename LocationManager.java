public class LocationManager {
    private Graph graph;
    private LocationTree tree;

    public LocationManager(Graph graph, LocationTree tree) {
        this.graph = graph;
        this.tree = tree;
    }

      public void addLocation(String name) {
        if (graph.addLocation(name)) {
            tree.insert(name);
            System.out.println("Location '" + name + "' added successfully.");
        } else {
            System.out.println("Location '" + name + "' already exists.");
        }
    }

        public void removeLocation(String name) {
        if (graph.removeLocation(name)) {
            tree.remove(name);
            System.out.println("Location '" + name + "' removed successfully.");
        } else {
            System.out.println("Location '" + name + "' not found.");
        }
    }

        public void addRoad(String from, String to) {
        if (graph.addRoad(from, to)) {
            System.out.println("Road added successfully between '" + from + "' and '" + to + "'.");
        } else {
            System.out.println("Failed to add road! Check that both locations exist.");
        }
    }

    public void removeRoad(String from, String to) {
        if (graph.removeRoad(from, to)) {
            System.out.println("Road removed successfully between '" + from + "' and '" + to + "'.");
        } else {
            System.out.println("Failed to remove road! Check that both locations exist and are connected.");
        }
    }
