package day13;

import java.util.Scanner;

public class Leet494 {
	public static int count =0;
	public static int find(int[] nums,int t) {
		backtrack(nums,0,0,t);
		return count;
	}
	public static void backtrack(int[] nums,int idx,int curr,int t){
		//basecase
		if(idx==nums.length) {
			if(curr==t) {
				count++;
			}
			return;
		}
		//choice 1:add
		backtrack(nums,idx+1,curr+nums[idx],t);
		
		//2.subtract
		backtrack(nums,idx+1,curr-nums[idx],t);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int t = sc.nextInt();
		System.out.print(find(arr,t));
	}
}
