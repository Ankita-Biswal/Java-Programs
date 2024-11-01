package com.string;
import java.util.*;
public class removeSpace {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter one String:");
	String s= sc.nextLine();
	System.out.println(remove(s));
}
public static String remove(String s) {
	String s2="";
	int i=s.length()-1;
	while(i>=0) {
		while(i>=0&&s.charAt(i)==' ') {
			i--;
		}
		int end=i;
		while(i>=0&&s.charAt(i)!=' ') {
			i--;
		}
		if(end>=0) {
		if(s2.length()>0) {
			s2=" "+s2;
		}
		s2=s.substring(i+1,end+1)+s2;
	}
	}
	return s2;
}
}
