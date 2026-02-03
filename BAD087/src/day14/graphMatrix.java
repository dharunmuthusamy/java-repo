//undirected
package day14;

import java.util.*;

public class graphMatrix {
	int nv;
	//int[][] adj;  Adjacency Matrix
	ArrayList<ArrayList<Integer>> adj;
	graphMatrix(int nv){
		this.nv = nv;
		//this.adj = new int[nv][nv];
		this.adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<nv;i++) {
			adj.add(new ArrayList<>());
		}
	}
	void addEdge(int u,int v) {
		adj.get(u-1).add(v-1);
		adj.get(v-1).add(u-1);
		/*this.adj[u-1][v-1] = 1;
		this.adj[v-1][u-1] = 1;*/
	}
	/*void printMatrix() {
		for(int i=0;i<adj.length;i++) {
			for(int j=0;j<adj.length;j++) {
				System.out.print(adj[i][j]+" ");
			}
			System.out.println();
		}
	}*/
	void bfs(int start) {
		boolean visited[] = new boolean[nv];
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr);
			for(int neighbour:adj.get(curr)) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					q.add(neighbour);
				}
			}
		}
	}
	void dfsDef(int start,boolean[] visited) {
		visited[start] = true;
		System.out.print(start);
		for(int neigh:adj.get(start)) {
			if(!visited[neigh]) {
				dfsDef(neigh,visited);
			}
		}
	}
	void dfs(int start) {
		boolean[] visited = new boolean[nv];
		dfsDef(start,visited);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nv = sc.nextInt();
		graphMatrix g = new graphMatrix(nv);
		int nEdges = sc.nextInt();
		for(int i=0;i<nEdges;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			g.addEdge(u,v);
		}
		//g.printMatrix();
		for (int i = 0; i < nv; i++) {
	        System.out.println(i+1  + " -> "+g.adj.get(i));
	    }
		g.dfs(0);
	}
}
