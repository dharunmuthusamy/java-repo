package day5;

import java.util.Scanner;

public class SlidingWindow {
	public static int largeSum(int[] arr,int k) {
		int sum = 0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		int max = sum;
		for(int i=k;i<arr.length;i++) {
			max = Math.max(max, max-arr[i-k]+arr[i]);
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(largeSum(arr,sc.nextInt()));
}
}
