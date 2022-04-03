package com.razz1.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class BookSerializeIn {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("BookObject.ser");
			ObjectInputStream fos=new ObjectInputStream(fis);
			
			List<Book> list=(List<Book>)fos.readObject();
			Book b1=list.get(0);
			Book b2=list.get(1);
			Book b3=list.get(2);
			Book b4=list.get(3);
		
			fis.close();
			fos.close();
			
			System.out.println(b1.Book_title);
			System.out.println(b2.Book_author);
			System.out.println(b1.Book_rating);
			System.out.println(b1.Book_name);

	}catch(FileNotFoundException e) {
		System.out.println(e);
	}catch(IOException e) {
		System.out.println(e);
	}catch(Exception e) {
		System.out.println(e);
	}

}
}