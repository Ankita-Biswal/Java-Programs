package com.deadlockexp;

public class Stock {
private int items;
private static Stock obj=null;

private Stock() {
	
}

public static Stock getInstance(){
	if(obj==null)obj=new Stock();
	return obj;
}

synchronized public void update(int n) {
	items+=n;
	System.out.println("Stock is updated to "+items+"items");
	notifyAll();
}

synchronized public void consume(int n) {
	System.out.println("consumer required"+n+"items");
	
	while(items<n) {
		System.out.println("Stock is less , waiting for update");
	}
	try{wait();}catch(Exception e) {e.printStackTrace();}
	items+=n;
	System.out.println(n+"items are consumed");
	
}
}
