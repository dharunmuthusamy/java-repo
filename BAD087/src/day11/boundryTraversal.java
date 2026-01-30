package day11;

import java.util.*;

public class boundryTraversal {
	public static boolean isLeaf(TreeNode node) {
		return node.left==null&&node.right==null;
	}
	public static void addLeftBoundary(TreeNode node,List<Integer> res) {
		if(node==null) return;
		TreeNode curr = node.left;
		while(curr!=null) {
			if(!isLeaf(curr)) {
				res.add(curr.data);
			}
			curr = (curr.left!=null)?curr.left:curr.right;
		}
	}
	public static void addRightBoundary(TreeNode node,List<Integer> res) {
		Stack<Integer> st = new Stack<>();
		TreeNode curr = node.right;
		if(node==null) return;
		while(curr!=null) {
			if(!isLeaf(curr)) {
				st.push(curr.data);
			}
			curr = (curr.right!=null)?curr.right:curr.left;
		}
		while(!st.isEmpty()) {
			res.add(st.pop());
		}
	}
	public static void addLeaf(TreeNode node,List<Integer> res) {
		if(node==null) return;
			if(isLeaf(node)) {
				res.add(node.data);
			}
			addLeaf(node.left,res);
			addLeaf(node.right,res);
		}
	public static List<Integer> boundary(TreeNode node){
		List<Integer> res = new ArrayList<>();
		if(node==null) return res;
		if(isLeaf(node)) {
			res.add(node.data);
		}
		addLeftBoundary(node,res);
		addLeaf(node,res);
		addRightBoundary(node,res);
		return res;
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);   
        t1.left.right = new TreeNode(5);    
        t1.right.left = new TreeNode(6);  
        t1.right.right = new TreeNode(7);    
        t1.left.right.left = new TreeNode(8);
        t1.left.right.right = new TreeNode(9);
        System.out.print(boundary(t1));
	}
}
