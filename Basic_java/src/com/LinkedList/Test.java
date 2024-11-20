package com.LinkedList;

public class Test {

	public static void main(String[] args) {
	//Node first=null;
//		first=new Node(10);
//		first.next=new Node(20);
//		first.next.next=new Node(30);
//		first.next.next.next=new Node(40);
//		first.next.next.next.next=new Node(50);
//		 Node curr=first;
//		 while(curr!=null) {
//			 System.out.println(curr.ele);
//			 curr=curr.next;
		// 
		
		
		SingleLinkedList l=new SingleLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
        
		
		/*System.out.println(l.size());
		System.out.println(l.get(4));*/
		
		 }
	

}
