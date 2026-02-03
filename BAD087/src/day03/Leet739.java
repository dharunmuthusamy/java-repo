//Daily Temperature
package day03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
	
public class Leet739 {
	static int[] daily(int[] arr) {
		int ans[] = new int[arr.length];
		Arrays.fill(ans,0);
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() &&arr[st.peek()]<arr[i]) {
					int idx = st.pop();
					ans[idx] = i-idx;
				}
			st.push(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(Arrays.toString(daily(arr)));
	}
}
