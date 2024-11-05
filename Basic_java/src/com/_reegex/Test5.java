package com._reegex;
import java.util.regex.*;
public class Test5 {

	public static void main(String[] args) {
		String exp="ab+";
		String s="abcabbgajb";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find()) {
        	System.out.println(m.group());
        }
	}

}
