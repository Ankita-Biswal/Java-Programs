package com.deadlockexp;

public class ConsumeThread implements Runnable{
	
	int items;
	public ConsumeThread(int items) {
		this.items=items;
		new Thread(this).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("consume thread starts");
		Stock.getInstance().consume(items);
		
	}

}
