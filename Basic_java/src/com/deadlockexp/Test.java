package com.deadlockexp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock s= Stock.getInstance();
		new UpdateThread(25);
		try {
			Thread.sleep(200);
		}
		catch(Exception e) {}
		
		new ConsumeThread(30);
		try{Thread.sleep(3000);}catch(Exception e) {}
		new UpdateThread(25);

	}

}
