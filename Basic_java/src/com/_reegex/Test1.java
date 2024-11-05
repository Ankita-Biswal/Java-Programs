
package com._reegex;
import java.util.regex.*;
public class Test1 {

	public static void main(String[] args) {
		String s="abcabcabc";
		String exp="ab";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
	}

}
