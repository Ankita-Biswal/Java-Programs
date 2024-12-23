package com.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class mapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> m= new TreeMap<Integer,String>();
		m.put(7, "Thala");
		m.put(18, "King");
		m.put(45,"Rohit");
		m.put(1, "KL");
		m.put(31, "David bHai");
		
		Set<Integer> s=m.keySet();
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()) {
			int key=i.next();
			String res=m.get(key);
			System.out.println(key+"="+res);
		}
	}

}
