package com.string;

public class Demo1 {

	public static void main(String[] args) {
		String s1=new String("abcd");
		System.out.println(s1);
		
		String s2= "abcd";
		System.out.println(s2);

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
