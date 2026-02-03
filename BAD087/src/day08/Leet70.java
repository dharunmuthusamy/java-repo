package day08;

import java.util.Scanner;

public class Leet70 {
	public static int sol(int n) {
		int dp[] = new int[n+2];
		dp[0] =0;
		dp[1] = 1;
		for(int i=2;i<dp.length;i++) dp[i] = dp[i-1]+dp[i-2];
		return dp[n+1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(sol(n));
	}
}
