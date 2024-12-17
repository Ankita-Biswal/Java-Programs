package com.multithreading;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Thread t1= new Thread(new A());
     t1.setDaemon(true);
     t1.start();
     
     for(char c='A';c<='Z';c++) {
    	 System.out.println(c);
     }
     try {
		Thread.sleep(500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	}

}
