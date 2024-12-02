package com.BST;

public class BinarySearchTree {
private Node root;
private int count;
public void add(int key) {
	if(root==null) {
		root= new Node(key);
		count++;
		return;
		
	}
	Node curr=root;
	Node prev= null;
	
	while(curr!=null) {
		if(key<curr.key) {
			prev= curr;
			curr=curr.left;
		}
		else if(key>curr.key) {
			prev=curr;
			curr=curr.right;
		}
		else {
			return;
		}
	}
	if(key<prev.key)prev.left=new Node(key);
	else if(key>prev.key)prev.right=new Node(key);
	count++;
}
public int size() {
	return count;
}
}