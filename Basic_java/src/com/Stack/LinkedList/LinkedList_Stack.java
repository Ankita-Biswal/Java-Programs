package com.Stack.LinkedList;

import java.util.EmptyStackException;

public class LinkedList_Stack {
	 private Node first;
	private int count;
	
	public void push(Object e) {
		if(first==null) {
			first=new Node(e);
			count++;
			return;
		}
		Node temp =first;
		first=new Node(e);
		first.next=temp;
		count++;
		
	}
	public int size() {
		return count;
	}
	public Object peek() {
		if(first==null) {
			throw new EmptyStackException();
		}
		return first.ele;
	}
	public Object pop() {
		if(first==null) {
			throw new EmptyStackException();
		}
		Node temp=first;
		first=first.next;
		count--;
		return temp.ele;
		
	}
	
	public void get() {
		Node curr=first;
		while(curr!=null) {
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}
	

}
