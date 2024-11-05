//using build-in methods
package com.string;
import java.util.*;
public class balancedString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter one String:");
		String s=sc.nextLine();
	    System.out.println(isBalanced(s));
	}

	 static boolean isBalanced(String arg) {
		 String s= "";
			for(int i=0;i<arg.length();i++) {
				char c=arg.charAt(i);
				if(c=='['||c==']'||c=='{'||c=='}'||c=='('||c==')')
					s+=c;
			}
	      System.out.println(s);
		while(s.contains("[]")||s.contains("{}")||s.contains("()")) {
			s=s.replace("[]","");
			s=s.replace("{}","");
			s=s.replace("()","");
		}
		return s.length()==0;
	}

}
