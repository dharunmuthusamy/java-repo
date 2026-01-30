package day11;
import java.util.*;
public class Leet103 {
	public static List<List<Integer>> zigZag(TreeNode node){
		List<List<Integer>> lst = new ArrayList<>();
		if(node==null) return lst;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		boolean l2r = true;
		while(!q.isEmpty()) {
			int n = q.size();
			List<Integer> lst1 = new ArrayList<>();
			for(int i=0;i<n;i++) {
				TreeNode curr = q.poll();
				lst1.add(curr.data);
				if(curr.left!=null) q.add(curr.left);
				if(curr.right!=null) q.add(curr.right);
			}
			if(!l2r) {
				Collections.reverse(lst1);
			}
			lst.add(lst1);
			l2r = !l2r;
		}
		return lst;
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
        System.out.print(zigZag(t1));
	}
}
