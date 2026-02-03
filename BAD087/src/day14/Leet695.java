package day14;

import java.util.*;

public class Leet695 {
	
	static int count=0;
	static int printisland(int[][] arr) {
		int nc=arr[0].length;
		int nr=arr.length;
		for(int i=0;i<nr;i++) {
			for(int j=0;j<nc;j++) {
				if(arr[i][j]==1) {
					count++;
					dfs(arr,i,j);
				}
			}
		}
		return count;
	}
	
	static int dfs(int [][]arr,int i,int j) {
		//boundary check
		if(i<0|| j<0 || i>=arr.length||j>=arr[0].length||arr[i][j]==0)return;
		arr[i][j]=0;
		return 1+ dfs(arr,i-1,j)+dfs(arr,i+1,j)+dfs(arr,i,j-1)+dfs(arr,i,j+1);
	}

public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
	int nr=ah.nextInt();
	int nc=ah.nextInt();
	int arr[][]=new int[nr][nc];
	for(int i=0;i<nr;i++) {
		for(int j=0;j<nc;j++) {
			arr[i][j]=ah.nextInt();
		}
	}
	//printnei(arr);
	System.out.print(printisland(arr));
}
}

