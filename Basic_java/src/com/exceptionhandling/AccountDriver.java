package com.exceptionhandling;

public class AccountDriver {
public static void main(String[] args) {
	Account a=new Account(13000);
	try {
		a.withdraw(16000);
	}
	catch(insufficientBalException e) {
		System.out.println(e.getMessage());
	}
}
}
