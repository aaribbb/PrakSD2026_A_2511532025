package pekan9_2511532025;
import java.util.*;

public class GraphTraversal_2511532025 {
	private Map<String, List<String>> graph_2025 = new HashMap<>();
	
	// Menambahkan edge (graf tak berarah)
	public void addEdge_2025(String node1_2025, String node2_2025) {
		graph_2025.putIfAbsent(node1_2025, new ArrayList<>());
		graph_2025.putIfAbsent(node2_2025, new ArrayList<>());
		graph_2025.get(node1_2025).add(node2_2025);
		graph_2025.get(node2_2025).add(node1_2025);
	}
	// Menampilkan graf awal
	public void printGraph_2025() {
		System.out.println("Graf Awal (Adjacency List):");
		for (String node_2025 : graph_2025.keySet()) {
			System.out.print(node_2025 + " -> ");
			List<String> neighbors_2025 = graph_2025.get(node_2025);
			System.out.println(String.join(", ", neighbors_2025));
		}
		System.out.println();
	}
	// DFS rekursif
	public void dfs_2025(String start_2025) {
		Set<String> visited_2025 = new HashSet<>();
		System.out.println("Penelusuran DFS:");
		dfsHelper_2025(start_2025, visited_2025);
		System.out.println();
	}
	private void dfsHelper_2025(String current_2025, Set<String> visited_2025) {
		if (visited_2025.contains(current_2025)) return;
		visited_2025.add(current_2025);
		System.out.print(current_2025 + " ");
		for (String neighbor_2025 : graph_2025.getOrDefault(current_2025, new ArrayList<>())) {
			dfsHelper_2025(neighbor_2025, visited_2025);
		}
	}
	// BFS iteratif
	public void bfs_2025(String start_2025) {
		Set<String> visited_2025 = new HashSet<>();
		Queue<String> queue_2025 = new LinkedList<>();
		queue_2025.add(start_2025);
		visited_2025.add(start_2025);
		System.out.println("Penelusuran BFS:");
		while (!queue_2025.isEmpty()) {
			String current_2025 = queue_2025.poll();
			System.out.print(current_2025 + " ");
			for (String neighbor_2025 : graph_2025.getOrDefault(current_2025, new ArrayList<>())) {
				if (!visited_2025.contains(neighbor_2025)) {
					queue_2025.add(neighbor_2025);
					visited_2025.add(neighbor_2025);
				}
			}
		}
		System.out.println();
	}
		
	// Main
	public static void main(String[] args) {
		GraphTraversal_2511532025 graph_2025 = new GraphTraversal_2511532025();
		
		// Contoh graf: A-B, A-C, B-D, B-E
		graph_2025.addEdge_2025("A", "B");
		graph_2025.addEdge_2025("A", "C");
		graph_2025.addEdge_2025("B", "D");
		graph_2025.addEdge_2025("B", "E");
		
		// cetak grap awal
		System.out.println("Graf Awal adalah: ");
		graph_2025.printGraph_2025();
		
		graph_2025.dfs_2025("A");
		graph_2025.bfs_2025("A");
		
	}

}
