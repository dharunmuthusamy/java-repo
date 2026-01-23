//Fruit Into Baskets
package day5;

import java.util.*;
	
public class Leet904 {
	public static int sol(int[] arr) {
		int l =0,max=0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int r = 0;r<arr.length;r++) {
			hm.put(arr[r],hm.getOrDefault(arr[r],0)+1);
			while(hm.size()>2) {
				hm.put(arr[l], hm.getOrDefault(arr[l], 0)-1);
				if(hm.get(arr[l])==0) {
					hm.remove(arr[l]);
					
				}
				l++;
			}
			max = Math.max(max, r-l+1);
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
		System.out.print(sol(arr));
}
}
