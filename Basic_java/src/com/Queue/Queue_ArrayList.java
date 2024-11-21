package com.Queue;

public class Queue_ArrayList {
private Object[]a;
private int count;
Object peek;

public Queue_ArrayList() {
	a=new Object[5];
}

public void  Add(Object ele) {
	if(count>=a.length)increase();
	a[count++]=ele;
}

public void increase() {
	Object temp[]=new Object[a.length+3];
	System.arraycopy(a, 0, temp, 0,a.length);
	a=temp;
}

public void get() {
	for(int i=0;i<size();i++) {
		System.out.println(a[i]);
	}
}

public int size() {
	return count;
}
public Object peek() {
	if(count==0)return null;
	return a[0];
}
public Object Poll() {
	if(count==0)return null;
	
	Object temp=a[0];
	for(int i=0;i<count;i++) {
		a[i]=a[i+1];
		
	}
	a[--count]=null;
	return temp;
}
}
