package day8;

import java.util.*;

public class recursion {
	static HashMap<Integer,Integer> hm = new HashMap<>();
	public static int fib(int n) { //Memoization
		if(n<=1) return n;
		if(hm.containsKey(n)) return hm.get(n);
		int result = fib(n-1)+fib(n-2);
		hm.put(n,result);
		return result;
	}
	public static int fib2(int n) {//tabulation
		int dp[] = new int[n+1];
		dp[0] =0;
		dp[1] =1;
		for(int i=2;i<n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	public static void main(String[] args) {
		System.out.println(fib(10));
		System.out.println(fib(5));
		System.out.println(fib(11));
	}
}
