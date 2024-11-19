package com.ArrayList;

public class Arraylist {
private Object []a;
private int pos;

public Arraylist() {
	a=new Object[6];
	pos=0;
}

public void Add (Object e) {
	if(pos>=a.length) {
		Object[]temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp,0 , a.length);
		a=temp;
	}
	a[pos]=0;
	pos++;
}
}
