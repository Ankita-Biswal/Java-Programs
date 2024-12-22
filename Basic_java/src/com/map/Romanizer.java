package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Romanizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convert(2753));
		
	}

	private static String convert(int num) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> m= new LinkedHashMap<Integer, String>();
		 
		 String res="";
		 
		 m.put(1, "I");
		 m.put(4, "IV");
		 m.put(5, "V");
		 m.put(9, "IX");
		 m.put(10, "X");
		 m.put(40, "XL");
		 m.put(50, "L");
		 m.put(90, "XC");
		 m.put(100, "C");
		 m.put(400, "CD");
		 m.put(500, "D");
		 m.put(900, "CM");
		 m.put(1000, "M");
		
		 
		 int []n= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		 
		 for(int value:n) {
			 while(num>=value) {
				 res+=m.get(value);
				 num-=value;
			 }
		 }
		
		return res;
	}

}
