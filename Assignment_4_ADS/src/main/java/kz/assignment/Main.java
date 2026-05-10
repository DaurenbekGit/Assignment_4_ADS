package kz.assignment;
public class Main {

    public static void main(String[] args) {

        Graph g = new Graph();

        for (int i = 0; i < 10; i++) {
            g.addVertex(new Vertex(i));
        }

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 6);

        System.out.println("Graph:");
        g.printGraph();

        System.out.println("\nBFS:");
        g.bfs(0);

        System.out.println("\n\nDFS:");
        g.dfs(0);

        Experiment exp = new Experiment();

        System.out.println("\n");
        exp.runTraversals(g);
    }
}