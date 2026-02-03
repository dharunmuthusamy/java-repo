package day13;

import java.util.LinkedList;
import java.util.Queue;


public class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	int height;
	TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		this.height =1;
	}
	public static int height(TreeNode node) {
		return node==null?0:node.height;
	}
	public static int getBalance(TreeNode node) {
		return height(node.left)-height(node.right);
	}
	public static TreeNode leftRotate(TreeNode y) { 
		TreeNode x = y.right;
		TreeNode t2 = x.left;
		x.left = y;
		y.right = t2;
		y.height = Math.max(height(y.left), height(y.right))+1;
		x.height = Math.max(height(x.left), height(x.right))+1;
		return x;
	}
	public static TreeNode rightRotate(TreeNode y) {
		TreeNode x = y.left;
		TreeNode t2 = x.right;
		x.right = y;
		y.left = t2;
		y.height = Math.max(height(y.left), height(y.right))+1;
		x.height = Math.max(height(x.left), height(x.right))+1;
		return x;
	}
	public static TreeNode insert(int n,TreeNode node){
        if(node==null) return new TreeNode(n);
        if(node.data<n) node.right = insert(n,node.right);
        else                 
        node.left = insert(n,node.left);
        node.height = 1+Math.max(height(node.left), height(node.right));
        int bf = getBalance(node);
        //left heavy straight
        if(bf>1 && n<node.left.data) return rightRotate(node);
        //left heavy zig-zag
        if(bf>1 && n>node.left.data) {
        	node.left = leftRotate(node);
        	return rightRotate(node);
        }
        //right heavy
        if(bf<-1 && n>node.right.data) return leftRotate(node);
        //right heavy zig-zag
        if(bf<-1 && n<node.right.data) {
        	node.right = rightRotate(node.right);
        	return leftRotate(node);
        	
        }
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