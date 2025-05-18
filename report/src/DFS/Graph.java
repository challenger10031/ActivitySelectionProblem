package DFS;

import java.util.LinkedList;

public class Graph {
    private int v;
	private LinkedList<Integer>[] adj;
	public Graph(int v) {
		this.v=v;
		this.adj=new LinkedList[v];
		for(int i=0;i<v;i++) adj[i]=new LinkedList<>();
	}
	public void addEdge(int f,int t) {
		adj[f].add(t);
	}
	public void DFS(int s) {
		boolean[] vis=new boolean[v];
		dfs(s,vis);
	}
	private void dfs(int c,boolean[] vis) {
		vis[c]=true;
		System.out.print(c+" ");
		for(int n:adj[c]) if(!vis[n]) dfs(n,vis);
	}
}
