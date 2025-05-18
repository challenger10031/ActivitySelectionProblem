package DFS;

import BFS.Graph;

public class DFS {
    public static void main(String[] args) {
		Graph g=new Graph(5);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(2,4);
		System.out.println("DFS starting from 0:");
		g.DFS(0);
	}
}
