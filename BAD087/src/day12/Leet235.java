package day12;

import java.util.Scanner;

public class Leet235 {
	static TreeNode LCA(TreeNode node,TreeNode p,TreeNode q) {
		if(node==null) return null;
		if(node.data>p.data&&node.data>q.data) return LCA(node.right,p,q);
		if(node.data<p.data&&node.data<q.data) return LCA(node.left,p,q);
		return node;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		TreeNode t1 = null;
		for(int i:arr){
		    t1 = t1.insert(i,t1);
		}
		t1.lbylorder(t1);
		//LCA(t1,sc.nextInt(),sc.nextInt());
		t1.lbylorder(t1);
	}
}
