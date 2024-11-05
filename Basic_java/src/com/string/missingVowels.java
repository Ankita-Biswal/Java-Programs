package com.string;
import java.util.*;
public class missingVowels {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter one string");
		String s= sc.nextLine();
		System.out.println("Missing vowels are :"+findmissingVowels(s));
	}

public static String findmissingVowels(String s) {
		boolean[]vP=new boolean[5];
		for(char c:s.toCharArray()) {
			c=Character.toLowerCase(c);
			switch(c) {
			case 'a':vP[0]=true;break;
			case 'e':vP[1]=true;break;
			case 'i':vP[2]=true;break;
			case 'o':vP[3]=true;break;
			case 'u':vP[4]=true;break;
			}
		}
		StringBuilder missingVowels=new StringBuilder();
		if(!vP[0])missingVowels.append("aA");
		if(!vP[1])missingVowels.append("eE");
		if(!vP[2])missingVowels.append("iI");
		if(!vP[3])missingVowels.append("oO");
		if(!vP[4])missingVowels.append("uU");
		return missingVowels.length()>0?missingVowels.toString():"All vowels are present:";
	}

}
