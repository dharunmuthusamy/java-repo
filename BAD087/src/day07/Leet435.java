package day07;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
public class Leet435 {
	static int sol(int[][] intervals) {
		if (intervals.length==0) return 0;
		int count = 0;
		Arrays.sort(intervals,new Comparator<int[]>() {
			public int compare(int[]a,int[]b) {
				return a[1]-b[1];
			}});
		int prevEnd = intervals[0][1];
		for(int i=1;i<intervals.length;i++) {
			int currEnd = intervals[i][1];
			int currStart = intervals[i][0];
			if(prevEnd>currStart) {
				count++;
			}else {
				prevEnd = currEnd;
			}	
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(sol(arr));
	}
}
