package com._reegex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter one String:");
		String s=sc.next();
		String exp="([a-z])\\1+";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		String s2="";
		while(m.find()) {
			String s1=m.group();
			s2=s2+s1.length()+s1.substring(0,1);
			
		}
        System.out.println(s2);
	}

}
