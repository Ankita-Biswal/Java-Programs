package com.ArrayList;

public class test {

	public static void main(String[] args) {
		Arraylist a = new Arraylist();
		System.out.println(a.Add("Ankita"));
		System.out.println(a.Add("Pratishruti"));
		System.out.println(a.Add("Rani"));
		System.out.println(a.Add("Sutun"));
		
		for(int i=0;i<a.Size();i++) {
			System.out.println(a.get(i));
		}
		
		
		System.out.println(a.AddPlace(0, "Sangeeta"));
		System.out.println("-----------------------------------------");
		
		
		for(int i=0;i<a.Size();i++) {
			System.out.println(a.get(i));
		}
		
		
		



	}

}