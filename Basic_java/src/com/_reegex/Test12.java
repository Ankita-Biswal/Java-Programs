package com._reegex;
import java.util.*;
import java.util.regex.Pattern;
public class Test12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter phone num:");
		String phn=sc.nextLine();
		if(isPhone(phn)) {
			System.out.println("It is valid");
		}
		else {
			System.out.println("It is invalid");
		}
	}
      static boolean isPhone(String p) {
    	  Pattern pt=Pattern.compile("[6-9][0-9]{9}");
    	  return pt.matcher(p).matches();
    	  
      }
}
