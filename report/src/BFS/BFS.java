package BFS;

public class BFS {
    public static void main(String[] args) {
		Graph g=new Graph(5);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(2,4);
		System.out.println("BFS starting from 0:");
		g.BFS(0);
	}
}
