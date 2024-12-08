package com.Collection_frameWork.Iterator;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class Demo1 {

	public static void main(String[] args) {
		Collection c=new TreeSet();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		Iterator i=c.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
