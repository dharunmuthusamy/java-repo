package day11;

import java.util.LinkedList;
import java.util.Queue;

public class Leet101 {
	public static boolean isSymmentry(TreeNode node) {
		if(node==null) return true;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node.left);
		q.add(node.right);
		while(!q.isEmpty()) {
			int size = q.size();
			TreeNode t1 = q.poll();
			TreeNode t2 = q.poll();
			if(t1==null&&t2==null) return true;
			if(t1==null||t2==null) return false;
			if(t1.data!=t2.data) return false;
			q.add(t1.left);
			q.add(t2.right);
			q.add(t1.right);
			q.add(t2.left);
		}
		return true;
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(2);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(3);
		t1.right.right = new TreeNode(3);
		t1.right.left = new TreeNode(4);
		t1.left.right = new TreeNode(4);
		System.out.print(isSymmentry(t1));
}
}
