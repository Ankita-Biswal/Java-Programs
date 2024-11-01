package com.string;
import java.util.*;
public class ReverseString {
	
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a string:");
	String s=sc.nextLine();
	System.out.println(reverse(s));
}

static String reverse(String s) {
	String s1=" ";
	for(int i=s.length()-1;i>=0;i--) {
		s1+=s.charAt(i);
	}
	return s1;
}

}
