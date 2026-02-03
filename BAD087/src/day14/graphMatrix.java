//undirected
package day14;

import java.util.Scanner;

public class graphMatrix {
	int nv;
	int[][] adj;
	graphMatrix(int nv){
		this.nv = nv;
		this.adj = new int[nv][nv]; 
	}
	void addEdge(int u,int v) {
		this.adj[u-1][v-1] = 1;
		this.adj[v-1][u-1] = 1;
	}
	void printMatrix() {
		for(int i=0;i<adj.length;i++) {
			for(int j=0;j<adj.length;j++) {
				System.out.print(adj[i][j]+" ");
			}
			System.out.println();
		}
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
		g.printMatrix();
	}
}
