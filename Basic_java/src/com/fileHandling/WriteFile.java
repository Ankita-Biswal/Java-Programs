package com.fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("D:\\javatutor\\java.txt");
		
		FileOutputStream f=new FileOutputStream(file);
		
		String s= "I am the best";
		byte[]b=s.getBytes();
		if(file.canWrite()) {
		f.write(b);
		}
		else {
		System.out.println("can't write the data into file");
       
	}
		 f.close();
}
}