package day10;

public class findHeight {
	public static int MaxHeight(TreeNode node) {
		if(node==null) return 0;
		return 1+Math.max(MaxHeight(node.left), MaxHeight(node.right));
	}
	public static int MinHeight(TreeNode node) {
		if(node==null) return 0;
		if (node.left == null) {
            return 1 + MinHeight(node.right);
        }
        if (node.right == null) {
            return 1 + MinHeight(node.left);
        }
		return 1+Math.min(MaxHeight(node.left), MaxHeight(node.right));
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(10);
		t1.left = new TreeNode(20);
		t1.left.left = new TreeNode(40);
		t1.left.right = new TreeNode(50);
		t1.right = new TreeNode(30);
		t1.right.left = new TreeNode(60);
		t1.left.left.left = new TreeNode(40);
		System.out.println(MinHeight(t1));
}
}
