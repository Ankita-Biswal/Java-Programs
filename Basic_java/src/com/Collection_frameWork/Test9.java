package com.Collection_frameWork;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Queue q=new PriorityQueue();
	   q.add(40);
	   q.add(20);
	   q.add(50);
	   q.add(10);
	   q.add(30);
	   
	   while(!q.isEmpty()) {
		   System.out.println(q.poll());
	   }
	}

}
