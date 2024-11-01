package com.string;
import java.util.*;
public class CountDig {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a  String:");
    String s1=sc.nextLine();
    int count=sumOfDig(s1);
    System.out.println("count of the numbers will be"+count);
    }
	static int sumOfDig(String s1) {
		int count=0;
		
		for(int i=0;i<=s1.length()-1;i++) {
			char c=s1.charAt(i);
			if(c>='0'&& c <='9') {
				count++;
			}
			
		}
		return count;
		
	}

}
