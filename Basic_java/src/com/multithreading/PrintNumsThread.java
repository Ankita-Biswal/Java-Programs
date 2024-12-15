package com.multithreading;

class PrintNumsThread extends Thread {
@Override
public void run() {
	System.out.println("run () method of printnums started");
	for(int i=1;i<=20;i++) {
		System.out.println(i);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	System.out.println("run () of printnums ended");
}
}
