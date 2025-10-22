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
