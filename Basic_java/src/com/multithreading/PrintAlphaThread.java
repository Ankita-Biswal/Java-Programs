package com.multithreading;

public class PrintAlphaThread extends Thread {
@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println(" run() of printalphathread started");
	for(char c='A';c<='Z';c++) {
		System.out.println(c);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	System.out.println("Run () of printAlphaThread ended");
}
}
