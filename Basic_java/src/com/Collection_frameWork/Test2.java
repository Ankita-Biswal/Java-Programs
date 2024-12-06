package com.Collection_frameWork;

import java.util.ArrayList;
import java.util.HashSet;

public class Test2 {
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
	

	
}
}
