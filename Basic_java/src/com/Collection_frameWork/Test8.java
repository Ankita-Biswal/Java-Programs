package com.Collection_frameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List l=new ArrayList();
	      l.add(40);
	      l.add(20);
	      l.add(50);
	      l.add(10);
	      l.add(30);
	      System.out.println(l);
	      Collections.sort(l, new DescComp());
	      System.out.println(l);
	}

}
class DescComp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2-i1;
	}
}