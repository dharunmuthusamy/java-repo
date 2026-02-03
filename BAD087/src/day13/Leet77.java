package day13;

import java.util.*;

public class Leet77 {
	static List<List<Integer>> res = new ArrayList<>();
	
	static void backtrack(int[] arr,int t,int start,List<Integer> curr) {
		if(t==0) res.add(new ArrayList<>(curr)); //basecase
		for(int i=start;i<arr.length;i++) {
			curr.add(arr[i]); //choose
			backtrack(arr,t-arr[i],i,curr); //explore
			curr.remove(curr.size()-1); //unchoose
		}
	}
	public static List<List<Integer>> combine(int n,int k){
		backtrack(arr,,k,new ArrayList<>());
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.print(combine(n,k));
	}
}
