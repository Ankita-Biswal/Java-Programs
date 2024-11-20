package com.LinkedList;

	public class DoublyLinkedList {
	    private Node head;
	    private Node tail;
	    private int count;

	    
	    public void add(Object e) {
	        Node newNode = new Node(e);
	        if (head == null) {
	            head = tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	        count++;
	    }

	    
	    public void add(int index, Object e) {
	        if (index < 0 || index > size()) {
	            throw new IndexOutOfBoundsException();
	        }
	        Node newNode = new Node(e);
	        if (index == 0) {
	            if (head == null) {
	                head = tail = newNode;
	            } else {
	                newNode.next = head;
	                head.prev = newNode;
	                head = newNode;
	            }
	        } else if (index == size()) {
	            add(e); 
	        } else {
	            Node curr = head;
	            for (int i = 0; i < index; i++) {
	                curr = curr.next;
	            }
	            newNode.next = curr;
	            newNode.prev = curr.prev;
	            curr.prev.next = newNode;
	            curr.prev = newNode;
	        }
	        count++;
	    }

	    
	    public int size() {
	        return count;
	    }

	   
	    public Object get(int index) {
	        if (index < 0 || index >= size()) {
	            throw new IndexOutOfBoundsException();
	        }
	        Node curr = head;
	        for (int i = 0; i < index; i++) {
	            curr = curr.next;
	        }
	        return curr.ele;
	    }

	    
	    public void remove(int index) {
	        if (index < 0 || index >= size()) {
	            throw new IndexOutOfBoundsException();
	        }
	        if (index == 0) {
	            if (head == tail) {
	                head = tail = null;
	            } else {
	                head = head.next;
	                head.prev = null;
	            }
	        } else if (index == size() - 1) {
	            tail = tail.prev;
	            tail.next = null;
	        } else {
	            Node curr = head;
	            for (int i = 0; i < index; i++) {
	                curr = curr.next;
	            }
	            curr.prev.next = curr.next;
	            curr.next.prev = curr.prev;
	        }
	        count--;
	    }

	    public void reverse() {
	        Node temp = null;
	        Node curr = head;

	        while (curr != null) {
	            temp = curr.prev;
	            curr.prev = curr.next;
	            curr.next = temp;
	            curr = curr.prev;
	        }

	       
	        if (temp != null) {
	            head = temp.prev;
	        }
	    }

	  
	    public void printList() {
	        Node curr = head;
	        while (curr != null) {
	            System.out.print(curr.ele + " ");
	            curr = curr.next;
	        }
	        System.out.println();
	    }

	    
	    public void printReverse() {
	        Node curr = tail;
	        while (curr != null) {
	            System.out.print(curr.ele + " ");
	            curr = curr.prev;
	        }
	        System.out.println();
	    }

	    
	    private static class Node {
	        Object ele;
	        Node next;
	        Node prev;

	        Node(Object ele) {
	            this.ele = ele;
	        }
	    }
	}


