package day11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet404 {
	public static int sumOfLeavesLeft(TreeNode node) {
		int sum =0;
		if(node==null) return 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				TreeNode curr = q.poll();
				if(curr.left!=null) {
					if(curr.left.left==null && curr.left.right==null)  {
						sum+= curr.left.data;
					}
					q.add(curr.left);
				}
				if(curr.right!=null) q.add(curr.right);
			}
		}
		return sum;
	}
	public static int sumOfLeavesRight(TreeNode node) {
		int sum =0;
		if(node==null) return 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				TreeNode curr = q.poll();
				if(curr.left!=null) q.add(curr.left);
				if(curr.right!=null) {
					if(curr.right.left==null&&curr.right.right==null) {
						sum+=curr.right.data;
					}
					q.add(curr.right);}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(9);
		t1.right = new TreeNode(20);
		t1.right.right = new TreeNode(7);
		t1.right.left = new TreeNode(15);
		System.out.print(sumOfLeavesRight(t1));
}
}
