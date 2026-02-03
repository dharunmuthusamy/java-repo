package day14;

import java.util.*;

public class printnein2d {
	/*static void printnei(int[][] arr) {

		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr[0].length;j++) {

				if(i!=0) System.out.print(arr[i-1][j]+" up");// up

				if(i<arr.length-1)System.out.print(arr[i+1][j]+" down"); //down

				if(j!=0)System.out.print(arr[i][j-1]+"left ");//left

				if(j<arr[0].length-1) System.out.print(arr[i][j+1]+"right");//right

				//if(i<0 || j>=arr[0].length) return;

				//if(i>=arr.length|| j<0) return ;

			}

			System.out.println();

		}

	}*/
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
	
	static void dfs(int [][]arr,int i,int j) {
		//boundary check
		if(i<0|| j<0 || i>=arr.length||j>=arr[0].length||arr[i][j]==0)return;
		arr[i][j]=0;
		dfs(arr,i-1,j);
		dfs(arr,i+1,j);
		dfs(arr,i,j-1);
		dfs(arr,i,j+1);
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
