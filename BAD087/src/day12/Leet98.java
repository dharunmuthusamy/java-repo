package day12;

public class Leet98 {
	public static boolean validate(TreeNode node,long min,long max) {
		if(node.data<min||node.data>max) return false;
		return true;
	}
	public static boolean isValisBst(TreeNode node,int min,int max) {
		if(node==null) return true;
		return validate(node.left,min,node.data)&&validate(node.right,node.data,max);
	}
}
