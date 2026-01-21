package pack1;
import java.util.*;
import java.util.Scanner;

public class Leet1512 {
	public static int bruteForce(int[] arr) { //
		int n = arr.length;
		int count = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
	public static int optimized(int[] arr) {
		HashMap<Integer,Integer>hm = new HashMap<>();
		int pairs =0;
		for(int i=0;i<arr.length;i++) {
			pairs = pairs+hm.getOrDefault(arr[i],0);
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i],1);
			}
		}
		return pairs;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(optimized(arr));
	}
}
