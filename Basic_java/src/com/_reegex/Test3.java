package com._reegex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test3{

	public static void main(String[] args) {
	String s="adcdedfddd";
	String exp="[a-z][d]";
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(s);
	while(m.find()) {
		System.out.println(m.group());
	}

	}

}
