package com.LinkedList;

public class SingleLinkedList {
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
curr.next=new Node(e);
count++;
}
public void add(int index,Object e) {
	if(index<=-1||index>=size()) {
		throw new IndexOutOfBoundsException();
	}
	if(index==0) {
		first=new Node(e,first);
		count++;
		return;
	}
	Node curr=first;
	for(int i=1;i<index;i++) {
		curr=curr.next;
	}
	curr.next=new Node(e,curr.next);
	count++;
}

 public int size() {
	
	return count;
}

public Object get(int index) {
	if(index<=-1||index>=size()) {
		throw new IndexOutOfBoundsException();
	}
	Node curr=first;
	for(int i=0;i<index;i++) {
		curr=curr.next;
	}
	return curr.ele;
}

public void remove(int index) {
	if(index<=-1||index>=size()) {
		throw new IndexOutOfBoundsException();
	}
	if(index==0) {
		first=first.next;
		count--;
		return;
	}
	Node curr=first;
	for(int i=1;i<index;i++) {
		curr=curr.next;
	}
	curr.next=curr.next.next;
	count--;
}

public void reverse() {
	Node prev=null;
	Node curr=first;
	Node next;
	
	while(curr!=null) {
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
	}
	first=prev;
}


}


