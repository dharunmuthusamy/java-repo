package day8;

import java.util.Arrays;
import java.util.Scanner;

public class jobScheduling {
	static class Job{
		int id;
		int dead;
		int profit;
		Job(int id,int dead,int profit){
			this.id = id;
			this.dead = dead;
			this.profit = profit;
		}
	}
	public static int[] sol(int[][] arr) {
		int n = arr.length;
		Job job[] = new Job[n];
		for(int i=0;i<arr.length;i++) {
			job[i] = new Job(arr[i][0],arr[i][1],arr[i][2]);
		}
		Arrays.sort(job,(a,b)->b.profit-a.profit);
		int maxDead = 0;
		for(int i=0;i<arr.length;i++) {
			maxDead = Math.max(maxDead, job[i].dead);
		}
		int dead[] = new int[maxDead+1];
		int jobCount=0,profit=0;
		for(Job j:job) {
			for(int day=j.dead;day>=1;day--) {
				if(dead[day]==0) {
					dead[day] = j.id;
					profit+=j.profit;
					jobCount++;
					break;
				}
			}
		}
		return new int[] {profit,jobCount};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][]  = new int[n][3];
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
			arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(Arrays.toString(sol(arr)));
	}
}	