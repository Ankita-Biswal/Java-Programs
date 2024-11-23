package com.LinkedList.DoubleLinkedList;



public class DoubleLinkedList {

	private Node first;
	private int count;
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(e,curr,null);
		count++;
		return;
	}
	
	
	public int size() {
		return count;
	}

	public void add(int index,Object e) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
			
		}
		if(index==0) {
			Node n=new Node(e,null,first);
			first.prev=n;
			first=n;
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
			
		}
		Node n=new Node(e,curr,curr.next);
		curr.next.prev=n;
		curr.next=n;
		count++;
	}
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
			
		}
		Node curr= first;
		for(int i=0;i<=index;i++) {
			curr=curr.next;
			
		}
		return curr.ele;
		
	}
	
	public void traverse() {
	    Node curr = first;
	    while (curr != null) {
	        System.out.print(curr.ele + " ");
	        curr = curr.next;
	    }
	    System.out.println();
	}

	
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
			
		}
		if(index==0) {
			first=first.next;
			first.prev=null;
			count--;
			return;
		}
		Node curr= first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
			
		}
		curr.next=curr.next.next;
		if(curr.next!=null)curr.next.prev=curr;
		count--;
	}
	
	
	public void reverse() {
		Node prev=null;
		Node curr= first;
		Node next=null;
		
		while(curr!=null) {
			next= curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
		}
		first=prev;
				
	}
	
	
	
	
}
