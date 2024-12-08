package com.Collection_frameWork.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class demo4 {
public static void main(String[] args) {
	
	List l= new ArrayList();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
	
	ListIterator li=l.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	System.out.println("--------------------------");
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
}
}
