package day13;
import java.util.*;
public class AVL {
	//methods for avl are in day13/TreeNode.java
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		TreeNode t1 = null;
	    for(int i:arr) {
	    	t1 = t1.insert(i, t1);	
		}
	t1.lbylorder(t1);
}
}
