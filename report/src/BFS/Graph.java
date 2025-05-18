package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int v;
	private LinkedList<Integer>[] adj;
	public Graph(int v) {
		this.v=v;
		this.adj=new LinkedList[v];
		for(int i=0;i<v;i++) this.adj[i]=new LinkedList<>();
	}
	public void addEdge(int f,int t) {
		adj[f].add(t);
	}
	public void BFS(int s) {
		boolean[] vis=new boolean[v];
		Queue<Integer> q=new LinkedList<>();
		vis[s]=true;
		q.add(s);
		while(!q.isEmpty()) {
			int c=q.poll();
			System.out.print(c+" ");
			for(int n:adj[c]) {
				if(!vis[n]) {
					vis[n]=true;
					q.add(n);
				}
			}
		}
	}
}

