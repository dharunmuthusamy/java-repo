package day09;

import java.util.Arrays;
import java.util.Scanner;

public class Leet300 {
	public static int lis(int[] arr) {
		int dp[] =new int[arr.length];
		Arrays.fill(dp, 1);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
				dp[i] = Math.max(dp[i], dp[j]+1);
				}
				}
		}
		int max =0;
		for(int i:dp) {
			max = Math.max(max, i);
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(lis(arr));
	}
}
