package day5;

import java.util.HashMap;
import java.util.Scanner;

public class Leet560 {
	public static int sol(int[] arr ,int k) {
		int curr=0,req=0,res=0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(0, 1);
		for(int i=0;i<arr.length;i++) {
			curr+=arr[i];
			req = k-curr;
			if(hm.containsValue(req)) {
				res+=hm.get(req);
			}
			hm.put(curr, hm.getOrDefault(curr, 0)+1);
		}
		return res;
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
