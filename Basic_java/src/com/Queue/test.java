package com.Queue;

import com.Queue.Queue_ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_ArrayList a = new Queue_ArrayList();
		a.Add(10);
		a.Add(20);
		a.Add(30);
		a.Add(40);
		System.out.println(a.size());
		System.out.println(a.peek());
		a.get();
	}
}
