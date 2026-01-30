package day11;

public class Leet236 {
	static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return (left != null) ? left : right;
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(5);
        t1.right = new TreeNode(1);
        t1.left.left = new TreeNode(2);   
        t1.left.right = new TreeNode(2);    
        t1.right.left = new TreeNode(0);  
        t1.right.right = new TreeNode(8);    
        t1.left.right.left = new TreeNode(7);
        t1.left.right.right = new TreeNode(4);
        TreeNode p=t1.left;
        TreeNode q=t1.left.right.right;
		System.out.print(lowestCommonAncestor(t1,p,q).data);
}
}
