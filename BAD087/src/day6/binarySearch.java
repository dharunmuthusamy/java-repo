package day6;

import java.util.*;
import java.util.Scanner;

public class binarySearch {
	public static int search(int[] arr,int t) {
		int r=arr.length-1,l=0;
		while(l<=r) {
			int m = l+(r-l)/2;
			if(t==arr[m]) {
				return m;
			}if(t<arr[m]) {
				r = m-1;
			}if(t>arr[m]){
				l = m+1;
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
		System.out.print(search(arr,sc.nextInt()));
	}
}
