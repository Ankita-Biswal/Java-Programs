package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      Student s1=new Student("Ankita", 22, 2, 987654321);
      
      FileOutputStream f= new FileOutputStream("D:\\javatutor\\java.txt");
       
      try (ObjectOutputStream of=new ObjectOutputStream(f))
      {
    	  of.writeObject(s1);
    	  System.out.println("Serialization Done!!!!!");
      }
	}

}
