package com.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileWriter f= new FileWriter("D:\\javatutor\\java.txt");
       try(BufferedWriter bf= new BufferedWriter(f)){
    	   bf.write("AnkitaBiswal");
    	   bf.newLine();
    	   bf.write("Fullstackdeveloper");
       }
	}

}
