package day12;

import java.util.Scanner;

public class arrayToTree {
	static void pre(TreeNode node) {
		 if(node == null) return;
		 System.out.print(node.data+" ");
		 pre(node.left);
		 pre(node.right);
		}

	static TreeNode build(int arr[],int l,int r) {
		if(l>r) return null;
		int mid=(l+r)/2;
		TreeNode node=new TreeNode(arr[mid]);
		node.left=build(arr,l,mid-1);
		node.right=build(arr,mid+1,r);
		return node;

	}

public static void main(String[] args) {

	int arr[]= {5,10,11,20,25,30,31,40,50,57};
	TreeNode t2=build(arr,0,arr.length-1);
	pre(t2);

		}
}
