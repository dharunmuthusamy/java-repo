package day13;

import java.util.*;

public class Leet78 {
	public static List<List<Integer>> res = new ArrayList<>();
	public static void backtrack(int[] nums,int start,List<Integer> curr) {
		res.add(new ArrayList<>(curr));
		for(int i=start;i<nums.length;i++) {
			curr.add(nums[i]); //choose
			backtrack(nums,i+1,curr); // explore
			curr.remove(curr.size()-1); //unchoose
		}
	}
	public static List<List<Integer>> aux(int[] nums){
		backtrack(nums,0,new ArrayList<>());
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.print(aux(arr));
	}
}
