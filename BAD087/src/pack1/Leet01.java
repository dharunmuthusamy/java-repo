package pack1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Leet01 {
	public static int[] twoSum(int[] arr,int t) {
		HashMap<Integer,Integer> hs = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(hs.containsKey(t-arr[i])) {
				return new int[] {hs.get(t-arr[i]),i};
			}
				hs.put(arr[i],i);
			
		}
		return new int[] {};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Leet01 ts = new Leet01();
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(twoSum(arr,t)));
	}
}
