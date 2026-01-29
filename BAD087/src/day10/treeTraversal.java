//inorder,postorder,preorder,levelorder(BFS)
package day10;
import java.util.*;
public class treeTraversal {
	static void inorder(TreeNode node) {
		if(node==null) return;
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	static void preorder(TreeNode node) {
		if(node==null) return;
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	static void postorder(TreeNode node) {
		if(node==null) return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
	static void levelorder(TreeNode node) {
		if (node==null) return;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			TreeNode curr = queue.poll();
			System.out.print(curr.data+" ");
			if(curr.left!=null) {
				queue.add(curr.left);
			}
			if(curr.right!=null) {
				queue.add(curr.right);
			}
		}
		}
	static void levelbyorder(TreeNode node) {
		if (node==null) return;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i=0;i<size;i++) {
			TreeNode curr = queue.poll();
			System.out.print(curr.data+" ");
			if(curr.left!=null) {
				queue.add(curr.left);
			}
			if(curr.right!=null) {
				queue.add(curr.right);
			}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(10);
		t1.left = new TreeNode(20);
		t1.left.left = new TreeNode(40);
		t1.left.right = new TreeNode(50);
		t1.right = new TreeNode(30);
		t1.right.left = new TreeNode(60);
		System.out.println("inorder");
		inorder(t1);
		System.out.println();
		System.out.println("preorder");
		preorder(t1);
		System.out.println();
		System.out.println("postorder");
		postorder(t1);
		System.out.println();
		System.out.println("levelorder");
		levelorder(t1);
		System.out.println();
		System.out.println("level-by-order");
		levelbyorder(t1);
		
	}
}
