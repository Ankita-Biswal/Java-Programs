package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
public static void main(String[] args) {
	System.out.println("main started");
	try {
		m1();
	}
	catch(FileNotFoundException e) {
		System.out.println("Handled");
	} 
}
public static void m1()throws FileNotFoundException{
	System.out.println("M1 executed");
	m2();
}
public static void m2()throws FileNotFoundException{
	System.out.println("M2 executed");
	FileReader f=new FileReader("../abcd.java");
}
}
