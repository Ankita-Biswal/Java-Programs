package com._reegex;

public class SplitArr {
public static void main(String[] args) {
	String s="a2b7c5d7";
	String[]arr=s.split("[a-z]");
	for(String str:arr) {
		System.out.println(str);
	}
}
}
