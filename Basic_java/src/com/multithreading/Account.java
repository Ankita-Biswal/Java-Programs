package com.multithreading;

public class Account {

	private int bal=0;
	
	synchronized void deposit(int a) {
		int currBal =bal;
		int newBal =currBal;
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		bal+=a;
		
		System.out.println(a+"rupees Deposited successfully!!");
	}
	synchronized void displayBal() {
		System.out.println("Bal="+bal);
	}
}
