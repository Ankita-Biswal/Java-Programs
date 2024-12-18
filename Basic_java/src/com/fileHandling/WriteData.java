package com.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("D:\\javatutor\\java.txt");
		
		
		FileWriter f=new FileWriter(file);
		
		if(file.canWrite())
			f.write("Hii This is Ankita"+"\n"+"From Odisha");
		else
			System.out.println("Can't write .............");
		    f.close();
		    
		  System.out.println("Executed.........");
		
	}

}
