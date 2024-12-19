package com.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      FileReader f= new FileReader("D:\\javatutor\\java.txt");
      BufferedReader br= new BufferedReader(f);
      String s= br.readLine();
      while(s!=null) {
    	 System.out.println(s);
    	 s=br.readLine();
      }
      br.close();
	}

}
