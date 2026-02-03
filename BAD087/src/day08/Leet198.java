package day08;

import java.util.Scanner;

public class Leet198 {
	public static int sol(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = arr[0]; //base case
		dp[1] = Math.max(dp[0],arr[1]);
		for(int i=2;i<arr.length;i++) {
			dp[i] = Math.max(dp[i], arr[i]+dp[i-2]);
		}
		return dp[arr.length-1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		     }
		System.out.print(sol(arr));
}
}
