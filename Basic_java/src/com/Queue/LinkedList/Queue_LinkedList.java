package com.Queue.LinkedList;

public class Queue_LinkedList {
	private Node first;
	private int count;
	
	
	
	
	public void Add(Object e) {
		if(first==null) {
			first=new Node(e);
			count++;
			return;
		}
		Node curr= first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(e);
		count++;
	}
	
	public void get() {
		Node curr=first;
		for(int i=0;i<Size();i++) {
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}
	

	
	
	public int Size() {
		return count;
	}
	
	public Object peek() {
		if(first==null) {
			throw new IndexOutOfBoundsException();
		}
	return first.ele;
	}
	
	
	public Object poll() {
		if(first==null) {
			throw new IndexOutOfBoundsException();
		}
		Node temp =first;
		
		first=first.next;
		count--;
		return temp.ele;
		
	}
	

}
