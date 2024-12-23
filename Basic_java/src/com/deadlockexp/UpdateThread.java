package com.deadlockexp;

public class UpdateThread implements Runnable {
	int items;

	public UpdateThread(int items) {
		this.items=items;
		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("update thread starts");
		Stock.getInstance().update(items);
		
	}

}
