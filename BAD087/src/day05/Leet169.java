package day05;

import java.util.Scanner;

public class Leet169 {
	public static int sol(int[] arr) {
		int count =0,candidate=0;
		for(int n:arr) {
			if(count==0) {
				candidate = n;
			}
			count+= n==candidate?1:-1;
		}
		return candidate;
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
