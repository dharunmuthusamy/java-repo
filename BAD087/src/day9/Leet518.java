package day9;

import java.util.Scanner;

public class Leet518 {
	public static int sum(int[] arr,int sum) {
		int[] dp = new int[sum+1];
		dp[0] = 1;
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i];j<=sum;j++) {
				dp[j]+=dp[j-arr[i]];
			}
		}
		return dp[sum];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(sum(arr,sc.nextInt()));
	}
}
