package day14;

import java.util.Scanner;

public class Leet200 {
	static void print(int[][] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i>0) System.out.print(arr[i-1][j]); //upward
				if(i<arr.length-1) System.out.print(arr[i][j+1]); //down
				if(j!=1&&j>1) System.out.print(arr[i][j-1]); // left
				if(j!=arr[0].length-1) System.out.print(arr[i-1][j-1]); //rig
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nr = sc.nextInt();
		int nc = sc.nextInt();
		int[][] arr = new int[nr][nc];
		for(int i=0;i<nr;i++) {
			for(int j=0;j<nc;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		print(arr);
}
}
