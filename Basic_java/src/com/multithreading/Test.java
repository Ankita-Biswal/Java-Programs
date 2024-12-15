package com.multithreading;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Main Started");
      Thread t1=new PrintNumsThread();
      t1.start();
      
      
      Thread t2=new PrintAlphaThread();
      t2.start();
      System.out.println("Main ended");
	}

}
