import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Experiment experiment = new Experiment();

        System.out.println("=== Small Graph (10 vertices) ===");
        Graph smallGraph = generateRandomGraph(10, 15);
        experiment.runTraversals(smallGraph, 0, true);

        System.out.println("\n=== Medium Graph (30 vertices) ===");
        Graph mediumGraph = generateRandomGraph(30, 50);
        experiment.runTraversals(mediumGraph, 0, false);

        System.out.println("\n=== Large Graph (100 vertices) ===");
        Graph largeGraph = generateRandomGraph(100, 200);
        experiment.runTraversals(largeGraph, 0, false);
    }

    private static Graph generateRandomGraph(int numVertices, int numEdges) {
        Graph graph = new Graph();
        Random random = new Random();

        for (int i = 0; i < numVertices; i++) {
            graph.addVertex(new Vertex(i));
        }


        for (int i = 0; i < numEdges; i++) {
            int source = random.nextInt(numVertices);
            int destination = random.nextInt(numVertices);

            if (source != destination) {
                graph.addEdge(source, destination);
            }
        }

        return graph;
    }
}