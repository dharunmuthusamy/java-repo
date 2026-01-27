package day2;
import java.util.*;
public class Leet2001 {
	public static int bruteForce(int[][] arr) {
		int count =0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				/*if(arr[i][0]*arr[j][1]==arr[j][0]*arr[i][1]) {
					count++;
				}*/
				if((double)arr[i][0]/arr[i][1]==(double)arr[j][0]/arr[j][1]) {
					count++;
				}
			}
		}
		return count;
	}
	public static int optimized(int[][] arr) {
		HashMap<Double,Integer> hm = new HashMap<>();
		int pairs = 0;
		for(int i=0;i<arr.length;i++) {
			pairs = pairs+hm.getOrDefault(arr[i],0);
			if(hm.containsKey((double)arr[i][0]/arr[i][1])) {
				hm.put((double)arr[i][0]/arr[i][1],hm.getOrDefault(arr[i],0));
			}
			else {
				hm.put((double)arr[i][0]/arr[i][1], 1);
			}
		}
		return pairs;
	}
	public static int gcd(int a,int b) {
		if (b==0) return a;
		return gcd(b,a%b);
	}
	public static int optimized1(int[][] arr) {
		HashMap<String,Integer> hm = new HashMap<>();
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			int w=arr[i][0];
			int h = arr[i][1];
			int gcd = gcd(w,h);
			w = w/gcd;
			h=h/gcd;
			String key = w+"/"+h;
			count += hm.getOrDefault(key,0);
			if(hm.containsKey(key)) {
				hm.put(key, hm.getOrDefault(key,0)+1);
			}else {
				hm.put(key, 1);
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(optimized1(arr));
	}
}
