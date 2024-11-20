package com.LinkedList;

public class Test2 {
	public static void main(String[] args) {
		
	
	 DoublyLinkedList list = new DoublyLinkedList();
     
     
     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
     list.add(50);

     System.out.println("List:");
     list.printList();

     
     list.reverse();
     System.out.println("Reversed List:");
     list.printList();

     
     System.out.println("Reverse Traversal:");
     list.printReverse();

     
     System.out.println("Element at index 2: " + list.get(2));

   
     list.remove(2);
     System.out.println("After removing index 2:");
     list.printList();
 
	 
}
}
