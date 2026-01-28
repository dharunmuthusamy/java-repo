package day9;

import java.util.Scanner;

public class Leet1143 {
	public static int lcs(String s1,String s2) {
		int n = s1.length();
		int m = s2.length();
		//no need of base case
		int[][] dp = new int[n+1][m+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[n][m];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.print(lcs(s1,s2));
}
}
