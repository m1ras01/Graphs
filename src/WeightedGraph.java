import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph<V> {
    private Map<Vertex<V>, List<Edge<V>>> map;

    public WeightedGraph() {
        this.map = new HashMap<>();
    }

    public void addVertex(Vertex<V> vertex) {
        if (!map.containsKey(vertex)) {
            map.put(vertex, new ArrayList<>());
        }
    }

    public void addEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        if (map.containsKey(source) && map.containsKey(destination)) {
            List<Edge<V>> edges = map.get(source);
            edges.add(new Edge<>(source, destination, weight));
        }
    }

    public List<Edge<V>> getEdges(Vertex<V> vertex) {
        return map.getOrDefault(vertex, new ArrayList<>());
    }
}
