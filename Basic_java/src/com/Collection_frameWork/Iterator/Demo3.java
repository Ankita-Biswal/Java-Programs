package com.Collection_frameWork.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo3 {
public static void main(String[] args) {
	
	Collection c= new ArrayList() ;
	c.add(1);
	c.add(2);
	c.add(3);
	c.add(4);
	c.add(5);
	c.add(6);
	System.out.println(c);
	Iterator i= c.iterator();
	while(i.hasNext()) {
		int j=(Integer)i.next();
		if(j%2!=0)i.remove();
	}
	System.out.println(c);
}
}
