package com.Stack.LinkedList;

public class LinkedList_Stack_impl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_Stack l = new LinkedList_Stack();
		l.push(10);
		l.push(20);
		l.push(30);
		//System.out.println(l.size());
		//System.out.println(l.peek());
		//System.out.println(l.size());
		l.get();
		System.out.println("Before");
		l.pop();
		System.out.println("After");
		l.get();
		System.out.println(l.size());
		l.push(90);
		l.get();

	}

}
