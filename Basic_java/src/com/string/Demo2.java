package com.string;

public class Demo2 {

	public static void main(String[] args) {
		String s1="java";
		String s2="JAVA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
	   Object o1="abcd";
	   System.out.println(o1);
	   
	   System.out.println(o1.equals("abcd"));
	   System.out.println(((String) o1).equalsIgnoreCase("ABCD"));
	}
	

}
