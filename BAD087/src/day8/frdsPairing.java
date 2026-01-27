package day8;

import java.util.Scanner;

public class frdsPairing {
	public static int sol(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3;i<dp.length;i++) {
			dp[i] = dp[i-1]+(i-1)*dp[i-2];
		}
		return dp[n];
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.print(sol(n));}
}
