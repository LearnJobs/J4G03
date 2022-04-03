package com.razz1.day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookSerializeOut {

	public static void main(String[] args) {
		try {
		Book b1 = new Book("a day in paradise", "LearnJobs", "4", "ruturaj");
		Book b2 = new Book("2states", "Vishal", "5", "akshit");
		Book b3 = new Book("3idiotd", "bigpictures", "5", "chetan bhagat");
		Book b4 = new Book("ek din", "t series", "3", "alia");
		
		List<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		FileOutputStream fos = new FileOutputStream("BookObject.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(list);

		oos.close();
		fos.close();
		System.out.println("book object is serialized");
	} catch(FileNotFoundException e) {
	} catch(IOException e) {
	} catch(Exception e) {
	}

}

	}


