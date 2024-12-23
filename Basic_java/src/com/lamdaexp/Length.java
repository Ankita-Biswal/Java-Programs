package com.lamdaexp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=Arrays.asList("Ankita","Somu","Simpul");
		
		Function<String, Integer> fn=i->i.length();
		
		for(String s:list) {
			System.out.println(fn.apply(s));
		}
	}

}
