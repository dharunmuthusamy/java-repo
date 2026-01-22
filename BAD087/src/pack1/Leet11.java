//Container with most water
package pack1;
import java.util.Scanner;

public class Leet11 {
	public static int maxArea(int[] arr) {
		int left=0,right = arr.length-1;
		int max =0;
		while(left<right) {
			int h = Math.min(arr[left], arr[right]);
			int w = right - left;
			max = Math.max(max,w*h);
			if(arr[left]<arr[right]) {
				left++;
			}
			else {
				right--;
			}
		}
		return max;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]  = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.print(maxArea(arr));
}
}
