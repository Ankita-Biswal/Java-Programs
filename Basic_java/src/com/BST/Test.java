package com.BST;

public class Test {

	public static void main(String[] args) {
		BST b= new BST();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		System.out.println(b.size());
		b.add(50);
		System.out.println(b.size());
	}
}

