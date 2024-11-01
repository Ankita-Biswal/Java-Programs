package com.string;

import java.util.Scanner;

public class consChar {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter one String:");
		String s=sc.nextLine();
		StringBuilder add=new StringBuilder();
		
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				add.append(s.charAt(i)).append(s.charAt(i+1)).append("");
				i++;
			}
		}
		if(add.length()>0) {
			System.out.println(add.toString());
		}
		
				}
}
