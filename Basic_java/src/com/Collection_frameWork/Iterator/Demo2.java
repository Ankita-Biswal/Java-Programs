package com.Collection_frameWork.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2 {
public static void main(String[] args) {
	Collection c= new ArrayList();
	c.add("Ruchi");
	c.add("Sonu");
	c.add("Rintu");
	c.add("Shreyan");c.add("Smayan");
	System.out.println(c);
	Iterator i= c.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
}
}
