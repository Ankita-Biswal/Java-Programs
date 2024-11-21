package com.LinkedList.DoubleLinkedList;


public class Node {
	    Object ele;
	    Node next;
	    Node prev;

	    Node(Object ele) {
	        this.ele = ele;
	        this.next = null;
	        this.prev = null;
	    }

	    Node(Object ele, Node prev, Node next) {
	        this.ele = ele;
	        this.prev = prev;
	        this.next = next;
	    }
	


}
