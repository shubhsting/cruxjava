package Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Graph {

	int numV;
	int[][] matrix;

	public Graph() {
		this(5);
	}

	public Graph(int N) {

		numV = N;
		matrix = new int[N + 1][N + 1];
	}

	public void addEdge(int u, int v, int c) {
		// Undirected
		matrix[u][v] = c;
		matrix[v][u] = c;
	}

	public int removeEdge(int u, int v) {

		int temp = matrix[u][v];
		matrix[u][v] = 0;
		matrix[v][u] = 0;

		return temp;
	}

	public int numEdges() {

		int cnt = 0;

		for (int i = 1; i <= numV; i++) {

			for (int j = 1; j <= numV; j++) {

				if (matrix[i][j] != 0) {
					cnt++;
				}
			}
		}

		return cnt / 2;

	}

	public boolean containsEdge(int u, int v) {

		return matrix[u][v] != 0;
	}

	@Override
	public String toString() {

		for (int i = 1; i <= numV; i++) {

			System.out.print(i + "-> ");
			for (int j = 1; j <= numV; j++) {

				if (matrix[i][j] != 0)
					System.out.print(j + "[" + matrix[i][j] + "], ");
			}
			System.out.println();
		}
		return "";
	}

	public boolean hasPath(int u, int v) {

		HashMap<Integer, Boolean> visited = new HashMap<>();
		return hasPath(u, v, visited, "");
	}

	private boolean hasPath(int src, int dst, HashMap<Integer, Boolean> visited, String asf) {

		if (containsEdge(src, dst)) {
			System.out.print(asf + src + dst);
			return true;
		}

		visited.put(src, true);

		for (int nbr = 1; nbr < matrix[0].length; nbr++) {

			if (!visited.containsKey(nbr) && containsEdge(src, nbr)) {
				boolean ans = hasPath(nbr, dst, visited, asf + src);
				if (ans) {
					return true;
				}
			}
		}

		return false;

	}

	public void hasAllPath(int u, int v) {

		HashMap<Integer, Boolean> visited = new HashMap<>();
		hasAllPath(u, v, visited, "");
	}

	private void hasAllPath(int src, int dst, HashMap<Integer, Boolean> visited, String asf) {

		if (src == dst) {
			System.out.println(asf + dst);

			return;
		}

		visited.put(src, true);

		for (int nbr = 1; nbr < matrix[0].length; nbr++) {

			if (!visited.containsKey(nbr) && matrix[src][nbr] != 0) {
				hasAllPath(nbr, dst, visited, asf + src);

			}
		}

		visited.remove(src);

	}

	class pair {
//asf==path so far 
		int data;
		String asf;
		String color = "a";

		pair(int d, String s) {
			data = d;
			asf = s;
		}

		pair(int d, String s, String c) {

			data = d;
			asf = s;
			color = c;
		}
	}

	public boolean BFS(int src, int dst) {

		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();
		// put the src pair in queue
		pair np = new pair(src, "");
		q.addLast(np);
		// work till queue is empty
		while (!q.isEmpty()) {

			pair rp = q.removeFirst();
			// ignore cases which are repeating i.e cyclic
			if (visited.containsKey(rp.data)) {
				continue;
			}
			// check condition
			if (containsEdge(rp.data, dst)) {
				System.out.println(rp.asf + rp.data + dst + " ");
				return true;
			}
			// put in visited
			visited.put(rp.data, true);
			// check neighbours ie distance 1,2,3,4......
			for (int nbr = 1; nbr <= numV; nbr++) {

				if (!visited.containsKey(nbr) && containsEdge(rp.data, nbr)) {
					q.addLast(new pair(nbr, rp.asf + rp.data));
				}
			}

		}

		return false;
	}

	public void BFT() {

		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		for (int src = 1; src <= numV; src++) {

			if (visited.containsKey(src)) {
				continue;
			}

			pair np = new pair(src, src + "");
			q.addLast(np);
			while (!q.isEmpty()) {

				pair rp = q.removeFirst();

				if (visited.containsKey(rp.data)) {
					continue;
				}

				System.out.println(rp.data + " Coming via " + rp.asf + " ");

				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (!visited.containsKey(nbr) && containsEdge(rp.data, nbr)) {
						q.addLast(new pair(nbr, rp.asf + nbr));
					}
				}

			}

		}
	}

	public boolean DFS(int src, int dst) {

		LinkedList<pair> stack = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		pair np = new pair(src, "");
		stack.addFirst(np);
		while (!stack.isEmpty()) {

			pair rp = stack.removeFirst();

			if (visited.containsKey(rp.data)) {
				continue;
			}

			if (containsEdge(rp.data, dst)) {
				System.out.println(rp.asf + rp.data + dst + " ");
				return true;
			}

			visited.put(rp.data, true);

			for (int nbr = 1; nbr <= numV; nbr++) {

				if (!visited.containsKey(nbr) && containsEdge(rp.data, nbr)) {
					stack.addFirst(new pair(nbr, rp.asf + rp.data));
				}
			}

		}

		return false;
	}

	public void DFT() {

		LinkedList<pair> stack = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		for (int src = 1; src <= numV; src++) {

			if (visited.containsKey(src)) {
				continue;
			}

			pair np = new pair(src, "");
			stack.addFirst(np);
			while (!stack.isEmpty()) {

				pair rp = stack.removeFirst();

				if (visited.containsKey(rp.data)) {
					continue;
				}

				System.out.println(rp.data + " Coming via " + rp.asf + " ");

				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (!visited.containsKey(nbr) && containsEdge(rp.data, nbr)) {
						stack.addFirst(new pair(nbr, rp.asf + rp.data));
					}
				}

			}
		}

	}

	// if cycle is not present graph is tree........
	public boolean isCyclic() {
		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		for (int src = 1; src <= numV; src++) {

			if (visited.containsKey(src)) {
				continue;
			}

			pair np = new pair(src, src + "");
			q.addLast(np);
			while (!q.isEmpty()) {

				pair rp = q.removeFirst();

				if (visited.containsKey(rp.data)) {
					return true;

				}

//				System.out.println(rp.data + " Coming via " + rp.asf + " ");

				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (!visited.containsKey(nbr) && containsEdge(rp.data, nbr)) {
						q.addLast(new pair(nbr, rp.asf + nbr));
					}
				}

			}

		}

		return false;

	}

	public boolean isConnected() {
		int count = 0;
		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		for (int src = 1; src <= numV; src++) {

			if (visited.containsKey(src)) {
				continue;
			}
			count = count + 1;
			pair np = new pair(src, src + "");
			q.addLast(np);
			while (!q.isEmpty()) {

				pair rp = q.removeFirst();

				if (visited.containsKey(rp.data)) {
					continue;
				}

//				System.out.println(rp.data + " Coming via " + rp.asf + " ");

				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (!visited.containsKey(nbr) && containsEdge(rp.data, nbr)) {
						q.addLast(new pair(nbr, rp.asf + nbr));
					}
				}

			}

		}

		return count == 1;
	}

	public boolean isTree() {

		int count = 0;
		boolean result = false;
		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		for (int src = 1; src <= numV; src++) {

			if (visited.containsKey(src)) {
				continue;
			}
			count = count + 1;
			pair np = new pair(src, src + "");
			q.addLast(np);
			while (!q.isEmpty()) {

				pair rp = q.removeFirst();

				if (visited.containsKey(rp.data)) {

					result = true;
					continue;
				}

				System.out.println(rp.data + " Coming via " + rp.asf + " ");

				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (!visited.containsKey(nbr) && containsEdge(rp.data, nbr)) {
						q.addLast(new pair(nbr, rp.asf + nbr));
					}
				}

			}

		}
		if (count == 1 && result) {
			return true;
		}
		return false;

	}

	// get cyclic components
	public void getCC() {
		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for (int src = 1; src <= numV; src++) {

			if (visited.containsKey(src)) {
				continue;
			}

			ArrayList<Integer> temp = new ArrayList<>();

			pair np = new pair(src, src + "");
			q.addLast(np);
			while (!q.isEmpty()) {

				pair rp = q.removeFirst();

				if (visited.containsKey(rp.data)) {
					continue;
				}

				visited.put(rp.data, true);
				temp.add(rp.data);
				for (int nbr = 1; nbr <= numV; nbr++) {

					if (!visited.containsKey(nbr) && containsEdge(rp.data, nbr)) {
						q.addLast(new pair(nbr, rp.asf + nbr));
					}
				}

			}
			res.add(temp);
		}
		System.out.println(res);
	}

	// can be filled with 2 colors
	public boolean bipertite() {
		LinkedList<pair> q = new LinkedList<>();
		HashMap<Integer, String> visited = new HashMap<>();

		for (int src = 1; src <= numV; src++) {

			if (visited.containsKey(src)) {
				continue;
			}

			pair np = new pair(src, src + "", "R");
			q.addLast(np);
			while (!q.isEmpty()) {

				pair rp = q.removeFirst();

				if (visited.containsKey(rp.data)) {
					String nc = rp.color;
					String oc = visited.get(rp.data);
					if (!nc.equals(oc)) {
						return false;
					}
					continue;
				}

				// System.out.println(rp.data + " Coming via " + rp.asf + " ");

				visited.put(rp.data, rp.color);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (!visited.containsKey(nbr) && containsEdge(rp.data, nbr)) {
						String nc = rp.color.equals("R") ? "G" : "R";

						q.addLast(new pair(nbr, rp.asf + nbr, nc));
					}
				}

			}

		}
		return true;

	}

	class PrimPair {

		int cost;
		int vertex;

		public PrimPair(int k, int v) {

			this.cost = k;
			this.vertex = v;
		}
	}

	class resultSet {

		int parent;
		int weight;

	}

	public void primMST() {

		int[] costs = new int[numV + 1];
		boolean[] mst = new boolean[numV + 1];
		resultSet[] results = new resultSet[numV + 1];

		for (int i = 1; i <= numV; i++) {
			costs[i] = Integer.MAX_VALUE;
			results[i] = new resultSet();

		}

		PriorityQueue<PrimPair> pq = new PriorityQueue<>(new Comparator<PrimPair>() {

			@Override
			public int compare(PrimPair o1, PrimPair o2) {

				return o1.cost - o2.cost;
			}

		});

		costs[1] = 0;
		PrimPair np = new PrimPair(costs[1], 1);
		pq.offer(np);

		results[1] = new resultSet();
		results[1].parent = -1;

		while (!pq.isEmpty()) {

			PrimPair extractedP = pq.poll();

			int extractedV = extractedP.vertex;
			mst[extractedV] = true;

			for (int i = 1; i <= numV; i++) {

				if (!mst[i] && matrix[extractedV][i] != 0) {

					int dest = i;
					int newCost = matrix[extractedV][i];

					if (costs[dest] > newCost) {
						PrimPair nbrpair = new PrimPair(newCost, dest);
						pq.offer(nbrpair);

						results[dest].parent = extractedV;
						results[dest].weight = newCost;

						costs[dest] = newCost;

					}
				}

			}
		}

		printMst(results);

	}

	public void Dijkstra(int src) {

		int[] costs = new int[numV + 1];
		boolean[] SPT = new boolean[numV + 1];

		for (int i = 1; i <= numV; i++) {
			costs[i] = Integer.MAX_VALUE;
		}

		PriorityQueue<PrimPair> pq = new PriorityQueue<>(new Comparator<PrimPair>() {

			@Override
			public int compare(PrimPair o1, PrimPair o2) {

				return o1.cost - o2.cost;
			}

		});

		costs[1] = 0;
		PrimPair np = new PrimPair(costs[1], 1);
		pq.offer(np);

		while (!pq.isEmpty()) {

			PrimPair extractedP = pq.poll();

			int extractedV = extractedP.vertex;

			if (SPT[extractedV]) {
				continue;
			}

			SPT[extractedV] = true;

			for (int i = 1; i <= numV; i++) {

				if (!SPT[i] && matrix[extractedV][i] != 0) {

					int dest = i;
					int newCost = matrix[extractedV][i] + costs[extractedV];

					if (costs[dest] > newCost) {
						PrimPair nbrpair = new PrimPair(newCost, dest);
						pq.offer(nbrpair);
						costs[dest] = newCost;

					}
				}

			}
		}

		printDijkstra(costs, src);

	}

	public void printDijkstra(int[] costs, int src) {

		System.out.println("Dijkstra Algorithm: ");

		for (int i = 1; i <= numV; i++) {

			System.out.println("Src Vertex: " + src + " to " + i + " cost is: " + costs[i]);
		}

	}

	public void printMst(resultSet[] results) {

		int tot_min_weight = 0;

		System.out.println("Minimum Spanning Tree: ");

		for (int i = 1; i <= numV; i++) {

			System.out.println("Edge: " + i + " - " + results[i].parent + " cost: " + results[i].weight);
			tot_min_weight += results[i].weight;
		}

		System.out.println("Total Minimum Key: " + tot_min_weight);
	}

}