package day5;
//Sort Colors
import java.util.Arrays;
import java.util.Scanner;

public class Leet75 {
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static int[] sortColor(int[] arr) {
		int m =0,l=0,h=arr.length-1;
		while(m<=h) {
			if(arr[m]==0) {
				swap(arr,m,l);
				l++;
				m++;
			}
			if(arr[m]==1) m++;
			if(arr[m]==2) {
				swap(arr,m,h);
				h--;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(Arrays.toString(sortColor((arr))));
}
}
