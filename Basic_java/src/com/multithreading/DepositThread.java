package com.multithreading;

public class DepositThread implements Runnable {

	Account ac;
	int amt;
	
	
	public DepositThread(Account ac, int amt) {
		
		this.ac = ac;
		this.amt = amt;
		new Thread(this).start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		ac.deposit(amt);
	}

}
