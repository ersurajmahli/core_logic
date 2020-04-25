package com.forgyan.tree;

public class Tree {
	
	Node root;
	
	public void insert(int data) {
		
		Node node = new Node();
		node.left = null;
		node.data = data;
		node.right = null;
		
		if(root==null) {
			root=node;
		}else {
			Node n = root;
			Node temp = null;
			
		}
		
	}
}
