//Largest rectangle in a histogram
package pack1;
import java.util.*;
import java.util.Stack;
public class Leet84 {
	public static int LRH(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int max =0,h=0,w=0,area=0,right=0,left=0,currentH = 0;
		for(int i=0;i<arr.length;i++) {
			currentH = arr[i];
			while(!st.isEmpty()&&currentH<arr[st.peek()]) {
				h = arr[st.pop()];
				right = i;
				left = st.isEmpty()?-1:st.peek();
				w = right-left-1;
				area = h*w;
				max = Math.max(area, max);
			}
			st.push(i);
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(LRH(arr));
	}
}
