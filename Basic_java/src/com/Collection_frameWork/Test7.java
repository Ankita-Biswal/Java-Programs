package com.Collection_frameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List l=new ArrayList();
      l.add(40);
      l.add(20);
      l.add(50);
      l.add(10);
      l.add(30);
      System.out.println(l);
      Collections.sort(l);
      System.out.println(l);
	}

}
