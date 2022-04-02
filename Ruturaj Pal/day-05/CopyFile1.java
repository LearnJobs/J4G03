package com.razz1.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile1 {
public String sourceFile ="Razz.txt";
public String destinationFile="CopyRazz.txt";

public CopyFile1() {
	try {
	InputStream in=new FileInputStream(sourceFile);
	OutputStream out=new FileOutputStream(destinationFile);
	int i=0;
	while((i=in.read()) != -1) {
		out.write(i);}
	out.close();
	in.close();
	}catch(FileNotFoundException e) {
		System.out.println(e);
	}catch(IOException e) {
		System.out.println(e);
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
public static void main(String[] args) {
	new CopyFile1();
}
}
