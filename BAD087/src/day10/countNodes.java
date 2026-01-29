package day10;

public class countNodes {
	public static int NoOfNodes(TreeNode node) {
		if(node==null) return 0; 
		return 1+NoOfNodes(node.left)+NoOfNodes(node.right);
	}
	public static int NoOfleaf(TreeNode node) {
		if(node==null) return 0; 
		if(node.right==null&&node.left==null) return 1;
		return NoOfleaf(node.left) + NoOfleaf(node.right);
	}
	public static int NoOfNonLeaf(TreeNode node) {
		if(node==null) return 0; 
		if(node.right==null&&node.left==null) return 0;
		return 1+NoOfNonLeaf(node.left) + NoOfNonLeaf(node.right);
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(10);
		t1.left = new TreeNode(20);
		t1.left.left = new TreeNode(40);
		t1.left.right = new TreeNode(50);
		t1.right = new TreeNode(30);
		t1.right.left = new TreeNode(60);
		System.out.println(NoOfNodes(t1));
		System.out.println(NoOfleaf(t1));
		System.out.println(NoOfNonLeaf(t1));
	}
}
