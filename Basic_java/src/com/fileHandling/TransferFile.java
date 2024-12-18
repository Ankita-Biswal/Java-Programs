package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TransferFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      
		FileInputStream f=new FileInputStream("D:\\javatutor\\java.txt");
		FileWriter fw=new FileWriter("D:\\javatutor\\java2.txt");
		
		int n=f.read();
		while(n!=-1) {
			fw.write((char)n);
			n=f.read();
		}
		fw.close();
		f.close();
	}

}
