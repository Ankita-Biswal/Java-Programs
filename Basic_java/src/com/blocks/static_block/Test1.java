package com.blocks.static_block;

public class Test1 {
static {
	System.out.println("static-1");
}
static {
	System.out.println("static-2");
}	
	public static void main(String[] args) {
		System.out.println("main starts");
        System.out.println("main ends");
	}

}
