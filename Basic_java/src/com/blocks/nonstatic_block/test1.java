package com.blocks.nonstatic_block;

public class test1 {

	static {
		{
			System.out.println("nonstatic-1");
		}
		System.out.println("static 1");
	}
	
	{
		System.out.println("nonstatic-2");
	}
	
	static {
		System.out.println("static 2");
	}
	public static void main(String[] args) {
		
		System.out.println("main starts");
		test1 t= new test1();
		test1 t2= new test1();
		{
			System.out.println("nonstatic 3");
		}
       System.out.println("main ends");
	}

}
