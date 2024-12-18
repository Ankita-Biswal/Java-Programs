package com.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
		File file=new File("D:\\javatutor\\java.txt");
		
		FileInputStream f= new FileInputStream(file);
		
		if(file.canRead()) {
			int n=f.read();
			
			while(n!=-1) {
				System.out.print((char)n);
				n=f.read();
			}
		}
		else {
			System.out.println("Can't read the data");
			f.close();
		}
	}

}
