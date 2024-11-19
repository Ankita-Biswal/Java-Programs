package com.LinkedList;

public class Test {

	public static void main(String[] args) {
		Node first=null;
		first=new Node(10);
		first.next=new Node(20);
		first.next.next=new Node(30);
		first.next.next.next=new Node(40);
		first.next.next.next.next=new Node(50);
		 Node curr=first;
		 while(curr!=null) {
			 System.out.println(curr.ele);
		 }

	}

}
