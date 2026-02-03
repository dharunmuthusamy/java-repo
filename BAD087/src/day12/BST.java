package day12;

import java.util.*;
public class BST {
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
	    public static TreeNode getMin(TreeNode node) {
	    	while(node.left!=null) {
	    		node=node.left;
	    	}
	    	return node;
	    }
	    public static TreeNode delete(TreeNode node,int key) {
	    	if(node==null) return null;
	    	if(key<node.data) node.left = delete(node.left,key);
	    	else if(key>node.data) node.right = delete(node.right,key);
	    	else {
	    		if(node.left==null) return node.right;
	    		if(node.left==null) return node.left;
	    		TreeNode min = getMin(node.right);
	    		node.data = min.data;
	    		node.right = delete(node.right,min.data);
	    	}
	    	return node;
	    }
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		TreeNode t1 = null;
		for(int i:arr){
		    t1 = insert(i,t1);
		}
		lbylorder(t1);
		delete(t1,sc.nextInt());
		lbylorder(t1);
	}
	}
