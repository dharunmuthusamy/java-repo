package day12;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public static TreeNode insert(int n,TreeNode node){
        if(node==null) return new TreeNode(n);
        if(node.data<n) node.right = insert(n,node.right);
        else
        node.left = insert(n,node.left);
        return node;
    }
    
    //DFS
    
    public static void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.right);
        System.out.print(node.data+" ");
        inorder(node.left);
    }
    static void preorder(TreeNode node){
        if(node==null) return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    static void postorder(TreeNode node){
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }
    
    //BFS
    
    public static void levelorder(TreeNode node){
        if(node==null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }
    public static void lbylorder(TreeNode node){
        if(node==null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
            TreeNode curr = q.poll();
            System.out.print(" "+curr.data+" ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
            }
            System.out.println();
        }
    }
}