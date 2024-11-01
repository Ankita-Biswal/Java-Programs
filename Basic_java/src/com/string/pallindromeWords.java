package com.string;
import java.util.*;
public class pallindromeWords {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter one string");
		String s=sc.nextLine();
		String[]str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(isPallindrome(str[i]))
				System.out.println(str[i]);
		}

	}

	
	static boolean isPallindrome(String s) {
		s=s.toLowerCase();
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
