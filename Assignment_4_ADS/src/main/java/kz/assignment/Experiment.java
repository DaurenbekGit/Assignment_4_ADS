package kz.assignment;

public class Experiment {

    public void runTraversals(Graph g) {

        long start = System.nanoTime();
        g.bfs(0);
        long end = System.nanoTime();

        System.out.println("\nBFS Time: " + (end - start) + " ns");

        start = System.nanoTime();
        g.dfs(0);
        end = System.nanoTime();

        System.out.println("\nDFS Time: " + (end - start) + " ns");
    }
}