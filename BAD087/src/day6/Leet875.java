package day6;

import java.util.Scanner;

public class Leet875 {
	public static int sol(int[] arr,int h) {
		int max=0,total =0;
		for(int n:arr) {
			max = Math.max(max, n);
			total+=n;
		}
		int low = 1;
		int high = max;
		while(low<=high) {
			int mid = low+(high-low)/2;
			long sum=0;
			for(int n:arr) {
				sum+= (n+mid-1)/mid; //Math.ceil for p/mid
			}
			if(sum<=h) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return low;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		     }
		System.out.print(sol(arr,sc.nextInt()));
}
}
