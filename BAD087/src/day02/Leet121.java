package day02;
import java.util.*;
public class Leet121 {
	public static int bruteForce(int[] arr) {
		int n = arr.length;
		int profit =0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				profit = Math.max(arr[j]-arr[i],profit);
			}
		}
		return profit;
	}
	public static int optimal(int[] arr) {
		int minprice = arr[0];
		int max =0;
		for(int price:arr) {
			if(price<minprice) {
				minprice = price;
			}
			else {
				max = Math.max(max, price-minprice);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(bruteForce(arr));
	}
}
