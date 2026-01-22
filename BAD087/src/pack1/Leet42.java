//trapping-rain-water
package pack1;

import java.util.Scanner;
public class Leet42 {
	public static int trap(int[] arr) {
		int left =0,right=arr.length-1,leftmax=0,rightmax=0,water=0;
		while(left<right) {
			if(arr[left]<=arr[right]) {
				leftmax = Math.max(leftmax, arr[left]);
				water+=leftmax-arr[left];
				left++ ;
			}else {
				rightmax = Math.max(rightmax, arr[right]);
				water+=rightmax-arr[left];
				right-- ;
			}
		}
		return water;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(trap(arr));
	}
}