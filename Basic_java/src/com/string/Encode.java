package com.string;
import java.util.*;
public class Encode {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter one string:");
	String s=sc.nextLine();
	String encodedStr=encode(s,1);
	System.out.println(encodedStr);
}
static String encode(String s,int l) {
	char[]a=s.toCharArray();
	char[]letters="abcdefghijklmnopqrstuvwxyz".toCharArray();
	for(int i=0;i<s.length();i++) {
		char c=a[i];
		a[i]=letters[((c-97)+l)%26];
	}
	return new String(a);
}
}
