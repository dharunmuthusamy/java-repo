package day13;

import java.util.*;

public class targetSum {
	static List<List<Integer>> res = new ArrayList<>();
	
	static void backtrack(int[] arr,int start,int end,int k,List<Integer> curr) {
		if(curr.size()==k) res.add(new ArrayList<>(curr)); //basecase
		for(int i=start;i<=end;i++) {
			curr.add(i); //choose
			backtrack(i+1,end,k,curr); //explore
			curr.remove(curr.size()-1); //unchoose
		}
	}
	public static List<List<Integer>> combinationSum(int n,int k){
		backtrack(1,n,k,new ArrayList<>());
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int t = sc.nextInt();
		System.out.print(combinationSum(arr,t));
	}
}
