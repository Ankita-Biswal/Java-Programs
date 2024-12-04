package com.treetraversal;

public class Demo {

public static void main(String[] args) {
	BST b= new BST();
	b.add(30);
	b.add(20);
	b.add(10);
	b.add(40);
	b.add(60);
	b.add(50);
	b.add(80);
	b.add(70);
	b.add(90);
	
	
	b.levelOrder();
}
}
