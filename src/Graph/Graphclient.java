package Graph;

public class Graphclient {

	public static void main(String[] args) {
		Graph g = new Graph(7);
		g.addEdge(1, 2, 4);
		g.addEdge(1, 4, 5);
		g.addEdge(2, 3, 6);
		g.addEdge(3, 4, 3);
		g.addEdge(4, 5, 10);
		g.addEdge(5, 6, 11);
		g.addEdge(6, 7, 13);
		g.addEdge(5, 7, 12);

		System.out.println(g);
		g.removeEdge(3, 4);
		g.removeEdge(5, 6);
		System.out.println(g.isCyclic());
		g.getCC();
	}

}
