package com._reegex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test4 {

	public static void main(String[] args) {
	String s="abcabbgajb";
	String exp="ab?";
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(s);
	while(m.find()) {
		System.out.println(m.group()+""+m.start()+""+m.end());
	}

	}

}
