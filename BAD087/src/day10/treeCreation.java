package day10;

import java.util.Scanner;

public class treeCreation {
	static void inorder(TreeNode node) {
		if(node==null) return;
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	public static int index = 0;
	public static TreeNode buildTree(int[] arr) {
		if(index>=arr.length)
			return null;
		if(arr[index]==-1) {
			index++;
		    return null;}
		TreeNode curr = new TreeNode(arr[index++]);
		curr.left = buildTree(arr);
		curr.right = buildTree(arr);
		return curr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		TreeNode t1 = buildTree(arr);
		inorder(t1);
	}
}
