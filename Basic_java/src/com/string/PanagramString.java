package com.string;
import java.util.*;
public class PanagramString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter one String");
		String str= sc.nextLine();
		System.out.println(isPanagram(str));

	}
    public static boolean isPanagram(String s1) {
    	s1=s1.toLowerCase();
    	if(s1.length()<26)return false;
    	for(char ch='a';ch<='z';ch++) {
    		if(s1.indexOf(ch)==-1)return false;
    		
    	}
    	return true;
    }
}
