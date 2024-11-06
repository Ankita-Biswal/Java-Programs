package com._reegex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter one String:");
		String s=sc.next();
		String exp="([a-z])([a-z])\\1";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group()+""+m.start()+""+m.end());
		}
		

	}

}
