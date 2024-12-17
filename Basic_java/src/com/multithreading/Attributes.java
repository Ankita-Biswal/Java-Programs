package com.multithreading;

public class Attributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Thread t1= Thread.currentThread();
      System.out.println(t1.getName());
      System.out.println(t1.getId());
      System.out.println(t1.getPriority());
	}

}
