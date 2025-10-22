import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        LocationTree tree = new LocationTree();
        LocationManager manager = new LocationManager(graph, tree);
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Smart City Route Planner ---");
            System.out.println("1. Add a new location");
            System.out.println("2. Remove a location");
            System.out.println("3. Add a road between locations");
            System.out.println("4. Remove a road");
            System.out.println("5. Display all connections");
            System.out.println("6. Display all locations");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number from 1 to 7.");
                continue; // redirect to main menu
            }
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter location name: ");
                    manager.addLocation(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter location name to remove: ");
                    manager.removeLocation(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter first location: ");
                    String a = sc.nextLine();
                    System.out.print("Enter second location: ");
                    String b = sc.nextLine();
                    manager.addRoad(a, b);
                }
                case 4 -> {
                    System.out.print("Enter first location: ");
                    String a = sc.nextLine();
                    System.out.print("Enter second location: ");
                    String b = sc.nextLine();
                    manager.removeRoad(a, b);
                }
                case 5 -> manager.showConnections();
                case 6 -> manager.showLocations();
                case 7 -> {
                    System.out.println("Exiting program. Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please enter a number from 1 to 7.");
            }
        }
   }
}



 
       
