package com.string;
import java.util.*;
public class CountVowels {
	
		public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a  String:");
	    String s1=sc.nextLine();
	    int count=countVowel(s1);
	    System.out.println("count of the Vowels will be"+count);
	    }
		static int countVowel(String s1) {
			int count=0;
			s1=s1.toLowerCase();
			for(int i=0;i<=s1.length()-1;i++) {
				
				char c=s1.charAt(i);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					count++;
				}
				
			}
			return count;
			
		}

	}



