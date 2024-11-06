package com._reegex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one string:");
		String s=sc.next();
		String exp="([a-z])\\1";
		Pattern p= Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find()) {
			String s1=m.group();
			String s2=s1.substring(0,1);
			s=s.replaceAll(s1, s2);
		}
        System.out.println(s);
	}

}
