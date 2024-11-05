package com.string;
import java.util.*;
public class Sequence {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter one string:");
	String s= sc.nextLine();
	
	int[]count=new int[256];
	
	StringBuilder res=new StringBuilder();
	for(int i=0;i<s.length();i++) {
		count[s.charAt(i)]++;
		char c=s.charAt(i);
	    res.append(count[c]);
	}
	
	System.out.println(res.toString());
}
}
