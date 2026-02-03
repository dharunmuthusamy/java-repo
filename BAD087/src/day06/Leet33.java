package day06;

import java.util.Scanner;

public class Leet33 {
	public static int sol(int[] arr,int t) {
		int l = 0,h=arr.length-1;
		while(l<=h) {
			int mid = l+(h-l)/2;
			if(arr[mid]==t) {
				return mid;
			}
			if(arr[l]<=arr[mid]) {
			if(t>=arr[l]&&t<arr[mid]) {
				h = mid-1;
			}else {
				l = mid;
			}
			}else {
				if(t<=arr[h]&&t>arr[mid]) {
					l = mid+1;
				}else {
					h = mid-1;
				}
			}
			
		}
		return -1;
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
