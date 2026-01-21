package pack1;
import java.util.*;
import java.util.Stack;
public class Leet496 {
	public static int[] bruteforce(int[] arr) {
		int res[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i] = -1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					res[i] = arr[j];
					break;
				}
			}
		}
		return res;
	}
	public static int[] optimizedStack(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int ans[] = new int[arr.length]; 
		for(int i=0;i<arr.length;i++) {
			ans[i]=-1;
			while(!st.isEmpty() && arr[st.peek()]<arr[i]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
				}
		return ans;
			}
	/*public static int[] optimizedHash(int[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		int 
		for(int i=0;i<arr.length;i++) {
			hm.put(arr[i], i);
		}
		for(int i=0;i<arr.length;i++) {
			
		}
	}*/
	public static int[] circularBruteForce(int[] arr) {
		int res[] =  new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=-1;
			for(int j=1;j<arr.length;j++) {
				int idx = (i+j)%arr.length;
				if(arr[i]<arr[idx]) {
					res[i] = arr[idx];
					break;
				}
			}
		}
		return res;
		}
	public static int[] circularOptimized(int[] arr) {
		int n=arr.length;
		int ans[] = new int[n];
		Arrays.fill(ans, -1);
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<2*n;i++) {
			int idx = i%n;
			while(!st.isEmpty()&&arr[st.peek()]<arr[idx]) {
				ans[st.pop()]=arr[idx];
			}
			if(i<n) {
				st.push(idx);
			}
		}
		return ans;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(Arrays.toString(circularOptimized(arr)));
	}
}
