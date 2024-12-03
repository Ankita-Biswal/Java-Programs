package com.Collection_frameWork;

import java.util.ArrayList;

public class Test3 {
public static void main(String[] args) {
	ArrayList a= new ArrayList();
	a.add(50);
	a.add(60);
	a.add(70);
	a.add(80);
	System.out.println("a="+a);
	ArrayList b= new ArrayList();
	b.add(90);
	b.add(100);
	System.out.println("b="+b);
	b.addAll(a);
	System.out.println("b="+b);
	System.out.println("is b a superset of a :"+b.containsAll(a));
	System.out.println("is a an superset of b :"+a.containsAll(b));
}
}
