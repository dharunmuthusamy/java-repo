package pack1;

import java.util.Scanner;

public class Leet134 {
	public static int travel(int[] gas,int[] cost) {
		int curr=0,start=0,overall=0;
		for(int i=0;i<gas.length;i++) {
			int balance = gas[i]-cost[i];
			overall +=balance;
			curr+=balance;
			if(curr<0) {
				start =i+1;
				curr=0;
			}
		}
		return overall>=0?start:-1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int gas[] = new int[n];
		int cost[] = new int[n];
		for(int i=0;i<n;i++) {
			gas[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			cost[i] = sc.nextInt();
		}
		System.out.print(travel(gas,cost));
	}
}
