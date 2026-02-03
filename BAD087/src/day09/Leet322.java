package day09;

import java.util.Arrays;
import java.util.Scanner;

public class Leet322 {
	public static int coinChangeMin(int[] arr,int amt) {
		if (amt==0) return 0;
		int dp[] = new int[amt+1];
		Arrays.sort(arr);
		Arrays.fill(dp, amt+1); //infinite fill
		dp[0] = 0;//base case
		
		for(int i=1;i<=amt;i++) {
			for(int coin:arr) {
				if (coin>i) break;
				else
					dp[i] = Math.min(dp[i], dp[i-coin]+1);
			}
		}
		return dp[amt]>amt?-1:dp[amt];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(coinChangeMin(arr,sc.nextInt()));
	}
}
