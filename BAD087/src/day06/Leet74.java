package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Leet74 {
		public static boolean sol(int[][] arr,int t) {
			int r = arr.length;
			int c = arr[0].length;
			int l=0,h=r*c-1;
			while(l<=h) {
				int mid = l+(h-l)/2;
				int val = arr[mid/c][mid%c];
				if(t==val) return true;
				else if(t<val) r = mid-1;
				else l = mid+1;
			}
			return false;
		}
		public static boolean staircase(int[][] arr,int t) {
			int r = arr.length,c=arr[0].length;
			int row = 0,col = c-1;
			while(row<r&&col>=0) {
				if(arr[row][col]==t) return true;
				else if(t>arr[row][col]) row++;
				else col--;
			}
			return false;
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
			System.out.print(staircase(arr,sc.nextInt()));
		}
}
