package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   File f= new File("D:\\javatutor\\java.txt");
     //System.out.println(f.mkdir());
	 System.out.println(f.createNewFile());	
	 System.out.println(f.canExecute());
	 System.out.println(f.canRead());
	 System.out.println(f.canWrite());
	 System.out.println(f.getAbsolutePath());
	 
	 File f2=new File("D:\\javatutor\\java2.txt");
	 System.out.println(f.renameTo(f2));
	 
	 System.out.println(f2.delete());
		
	}

}
