package com.Stack;

public class Stack_ArrayList {
	
	private Object[]a;
	private int count;
	Object peek;

	public Stack_ArrayList() {
		a=new Object[5];
	}

	public void  Push(Object ele) {
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
	public Object Pop() {
		if(count==0)return null;
		
		Object temp = a[count - 1];
		a[--count]=null;
		
		return temp;
	}
	}


