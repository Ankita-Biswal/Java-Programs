package com.Collection_frameWork;

import java.util.LinkedList;

public class Test6 {
public static void main(String[] args) {
	LinkedList a= new LinkedList();
	a.add(50);
	a.add(60);
	a.add(70);
	a.add(80);
	
	Object[]l=a.toArray();
	for(Object o:l) {
		System.out.println(o);
	}
}
}
