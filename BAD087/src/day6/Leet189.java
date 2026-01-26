package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Leet189 {
	static int[] reverse(int[] arr,int l,int r) {
		while(l<r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		return arr;
	}
	public static int[] rotateK(int[] arr,int k) {
		int n = arr.length;
		arr = reverse(arr,0,n-1);
		arr = reverse(arr,0,k-1);
		arr = reverse(arr,k,n-1);
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		     }
		System.out.print(Arrays.toString(rotateK(arr,sc.nextInt())));
		}
}