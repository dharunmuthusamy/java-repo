package day11;

import java.util.*;

public class LeetCode199 {
	public static List<Integer> rightView(TreeNode node) {
		List<Integer> lst = new ArrayList<>();
		if(node==null) return lst;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				TreeNode curr = q.poll();
				if(i==size-1) lst.add(curr.data);
				if(curr.left!=null) q.add(curr.left);
				if(curr.right!=null) q.add(curr.right);
			}
		}
		return lst;
	}
	public static List<Integer> leftView(TreeNode node) {
		List<Integer> lst = new ArrayList<>();
		if(node==null) return lst;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				TreeNode curr = q.poll();
				if(i==0) lst.add(curr.data);
				if(curr.left!=null) q.add(curr.left);
				if(curr.right!=null) q.add(curr.right);
			}
		}
		return lst;
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(2);
		t1.left.right = new TreeNode(5);
		t1.right = new TreeNode(3);
		t1.right.right = new TreeNode(4);
		System.out.print(leftView(t1));
}
}
