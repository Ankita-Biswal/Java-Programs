package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deseialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream f= new FileInputStream("D:\\javatutor\\java.txt");
		try(ObjectInputStream of= new ObjectInputStream(f)){
			Student s= (Student)of.readObject();
			System.out.println(s);
			System.out.println("Deserialization Done !!!!!!");
		}
	}

}
