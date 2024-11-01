package com.string;
import java.util.*;
public class pallindromesubstring {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter one String");
		String s=sc.nextLine();
		findPallindromeSubstring(s);
		}
	
	

	static boolean isPallindrome(String s1,int start,int end) {
		
		String s2=s1.toLowerCase();
		int i=start; int j=end;
		while(i<j) {
			if(s2.charAt(i)!=s2.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	
	static void findPallindromeSubstring( String s){
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(isPallindrome(s,i,j)) {
					System.out.println("the Substring pallindrome will be:"+s.substring(i,j+1));
				}
			}
			}
	}
}
