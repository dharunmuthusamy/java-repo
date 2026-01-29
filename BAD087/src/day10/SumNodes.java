package day10;

public class SumNodes {
	public static int sum=0;
	public static int sumAllNodes(TreeNode node) {
		if(node==null) return 0;
		sum = node.data+sumAllNodes(node.left)+sumAllNodes(node.right);
		return sum;
	}
	public static int sumLeaf(TreeNode node) {
		if(node==null) return 0;
		sum = sumLeaf(node.left)+sumLeaf(node.right);
		if(node.left==null&&node.right==null) 
			sum+= node.data;
		return sum;
	}
	public static int sumOfNonLeaf(TreeNode node) {
		if(node==null) return 0;
		if(node.left==null&&node.right==null) 
			return 0;
		
		return node.data+sumOfNonLeaf(node.left)+sumOfNonLeaf(node.right);
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(10);
		t1.left = new TreeNode(20);
		t1.left.left = new TreeNode(40);
		t1.left.right = new TreeNode(50);
		t1.right = new TreeNode(30);
		t1.right.left = new TreeNode(60);
		System.out.println(sumAllNodes(t1));
		System.out.println(sumLeaf(t1));
		System.out.println(sumOfNonLeaf(t1));
}
}
