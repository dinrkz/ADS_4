public class Experiment {

    public void runTraversals(Graph g, int startVertex, boolean isSmallGraph) {
        long startBfs = System.nanoTime();
        if(isSmallGraph) {
            g.bfs(startVertex);
        } else {
            // Чтобы не засорять консоль огромным выводом, можно вызывать модифицированный BFS без System.out.print
            g.bfs(startVertex);
        }
        long endBfs = System.nanoTime();

        long startDfs = System.nanoTime();
        if(isSmallGraph) {
            g.dfs(startVertex);
        } else {
            g.dfs(startVertex);
        }
        long endDfs = System.nanoTime();

        printResults("BFS", endBfs - startBfs);
        printResults("DFS", endDfs - startDfs);
    }

    public void printResults(String algorithm, long durationNano) {
        System.out.println("Execution time for " + algorithm + ": " + durationNano + " ns");
    }
}