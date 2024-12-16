package com.multithreading;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Account a1= new Account();
     
     new DepositThread(a1, 1000);
     new DepositThread(a1, 1000);
     
     try {
		Thread.sleep(2000);
	} catch (Exception e) {
		// TODO: handle exception
	}
     a1.displayBal();
	}

}
