package com.treetraversal;
import java.util.LinkedList;
import java.util.Queue;
public class BST {
private Node root;
private int count;
private boolean flag;


private Node addNode(Node n, int key) {
	if(n==null) {
		n=new Node(key);
		count++;
		return n;
	}
	if(key<n.key) {
		n.left=addNode(n.left,key);
	}
	else if(key>n.key) {
		n.right=addNode(n.right,key);
		
	}
	else {
		flag=false;
	}
	return n;	
}

public boolean add(int key) {
	flag=true;
	root= addNode(root,key);
	return flag;
} 
public int size() {
	return count;
}
//............Breadth First Search.........Level Order Traversal......//
public void levelOrder() {
	Queue q= new LinkedList();
	if(root!= null)q.add(root);
	while(!q.isEmpty()) {
		Node n= (Node)q.poll();
		System.out.print(n.key+" ");
		if(n.left!=null)q.add(n.left);
		if(n.right!=null)q.add(n.right);
	}
	System.out.println();
}
//Depth first search........PreOrder Traversal...........//
public void preOrder() {
preOrder(root);
System.out.println();
	
}
private void preOrder(Node n) {
	if(n==null)return;
	System.out.print(n.key+" ");
	preOrder(n.left);
	preOrder(n.right);
}
//...........postOrder traversal.........//
public void postOrder() {
postOrder(root);
System.out.println();
	
}
private void postOrder(Node n) {
	if(n==null)return;
	
	postOrder(n.left);
	postOrder(n.right);
	System.out.print(n.key+" ");
}
//...........inOrder traversal.........//
public void inOrder() {
inOrder(root);
System.out.println();
	
}
private void inOrder(Node n) {
	if(n==null)return;
	
	postOrder(n.left);
	System.out.print(n.key+" ");
	postOrder(n.right);
	
}
}
