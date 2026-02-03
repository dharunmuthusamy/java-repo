package day08;

import java.util.*;

public class Leet213 {
	public static int sol(int[] arr,int l,int r) {
		int prev1 = 0,prev2=0;
		for(int i=l;i<=r;i++) {
			int curr = Math.max(prev1, prev2+arr[i]);
			prev2 = prev1;
			prev1 = curr;
		}
		return prev1;
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
