package com.exceptionhandling;

public class Account {
int bal;
public Account(int bal) {
	this.bal=bal;
}
public void withdraw(int amount)throws insufficientBalException{
	if(amount>bal) {
		insufficientBalException e=new insufficientBalException();
		throw e;
	}
	bal-=amount;
	System.out.println(+amount);
	System.out.println(+bal);
}
}
