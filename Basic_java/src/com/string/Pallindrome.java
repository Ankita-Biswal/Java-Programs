package com.string;
import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one String:");
		String s1=sc.nextLine();
		System.out.println(isPallindrome(s1));

	}

	static boolean isPallindrome(String s1) {
		String s2=s1.toLowerCase();
		int i=0; int j=s2.length()-1;
		while(i<j) {
			if(s2.charAt(i)!=s2.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}

}
