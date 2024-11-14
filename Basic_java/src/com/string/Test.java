package com.string;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
		String s1 = sc.nextLine();
/*       [a|a|abb]
 *        i=0*/
		System.out.println(occur(s1));
	}
	public static String occur(String s) {
		StringBuilder res = new StringBuilder();
		int n =s.length();
		int i=0;
		
		while(i<n) {
			int count =1; //2
			int j=i+1;//2
			
		while(j<n&&s.charAt(i)==s.charAt(j)) {
			count++;
			++j;
		}
		
		
		for(int k=1;k<=count;k++) {
			if(count==1) {
				res.append(s.charAt(i));
			}
			else{res.append(k);
			}
		
		i=j;
		}
		
		}
		return res.toString();
	}

}
