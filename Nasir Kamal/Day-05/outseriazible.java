package Day05;

import java.awt.print.Book;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class outseriazible {
	

	public static void main(String[] args) {
		try {
		Book b1 = new Book("hjjkujkp", "Ly6ohj", "4", "kamal");
		Book b2 = new Book("2states", "t4ugghl", "3", "nasir");
		Book b3 = new Book("3idiotd", "tiu3ghgh", "3", "adnan");
		Book b4 = new Book("ek din", "uthugh", "4", "zoobi");
		
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


	
	
	
	


