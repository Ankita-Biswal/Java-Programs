package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String s= "Banana";
		Map<Character,String> m=new LinkedHashMap<Character,String>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(!m.containsKey(ch))
				m.put(ch, i+"");
			else
				m.put(ch,m.get(ch)+","+i);
		}
		
		System.out.println(m);
	}

}
