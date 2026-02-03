package day06;

import java.util.*;

public class Flat2DArray {
	public static int[] sol(int[][] arr) {
		int r = arr.length;
		int c = arr[0].length;
		int n = r*c;
		int[] res = new int[n];
		for(int i=0;i<n;i++) {
			int j = i/r,k=i%c;
			res[i] = arr[j][k];
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][]  = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			arr[i][j] = sc.nextInt();
		     }
          }
		System.out.print(Arrays.toString(sol(arr)));
	}
	}
