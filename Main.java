import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        LocationTree tree = new LocationTree();
        LocationManager manager = new LocationManager(graph, tree);
        Scanner sc = new Scanner(System.in);
        int choice;
    
