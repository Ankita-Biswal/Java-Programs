package com.string;
import java.util.*;
public class AnagramString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two String");
		String str=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(isAnagram(str,str2));
	}
public static boolean isAnagram(String s1,String s2) {
	while(true) {
		if(s1.length()!=s2.length())
			return false;
		if(s1.length()==0&&s2.length()==0)
			return true;
		char ch=s1.charAt(0);
		s1=s1.replace(ch+"", "");
		s2=s2.replace(ch+"", "");
	}
}
}
