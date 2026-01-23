//Maxmimum sum of subarray
package day5;

import java.util.Scanner;

public class Leet53 {
	public static int MaxSubarray(int[] arr) {
		int max =arr[0],curr=arr[0];
		for(int i=1;i<arr.length;i++) {
			curr = Math.max(arr[i],arr[i]+curr);
			max = Math.max(max, curr);
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
		System.out.print(MaxSubarray(arr));
}
}
