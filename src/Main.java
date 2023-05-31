import java.util.List;

public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();

        Vertex<String> vertexA = new Vertex<>("A");
        Vertex<String> vertexB = new Vertex<>("B");
        Vertex<String> vertexC = new Vertex<>("C");
        Vertex<String> vertexD = new Vertex<>("D");
        Vertex<String> vertexE = new Vertex<>("E");

        graph.addVertex(vertexA);
        graph.addVertex(vertexB);
        graph.addVertex(vertexC);
        graph.addVertex(vertexD);
        graph.addVertex(vertexE);

        graph.addEdge(vertexA, vertexB, 5);
        graph.addEdge(vertexA, vertexC, 2);
        graph.addEdge(vertexB, vertexD, 4);
        graph.addEdge(vertexC, vertexD, 1);
        graph.addEdge(vertexD, vertexE, 3);

        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>(graph);
        System.out.println("BFS:");
        bfs.bfs(vertexA);

        DijkstraSearch<String> dijkstra = new DijkstraSearch<>(graph);
        dijkstra.dijkstra(vertexA);
        System.out.println("\nDijkstra:");
        System.out.println("Shortest distance to E: " + dijkstra.getShortestDistance(vertexE));
        List<Vertex<String>> shortestPath = dijkstra.getShortestPath(vertexE);
        System.out.print("Shortest path to E: ");
        for (Vertex<String> vertex : shortestPath) {
            System.out.print(vertex.getData() + " ");
        }
    }
}
