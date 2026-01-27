package day8;

import java.util.Scanner;

public class Leet213 {
	public static int sol(int[] arr,int l,int r) {
		int[] dp = new int[arr.length-1];
		for(int i=l;i<=r;i++) {
			dp[i] = Math.max(dp[i-1], arr[i]+dp[i-2]);
		}
		return dp[dp.length-1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		     }
		System.out.print(Math.max(sol(arr,0,n-2),sol(arr,1,n-1)));
}
}
