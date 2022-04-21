package DAY5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class BookSerializeIn {

	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("BookObject.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			
			@SuppressWarnings("unchecked")
			List<Book> list = (List<Book>)ois.readObject();
			Book b1 = list.get(0);
			Book b2 = list.get(1);
			Book b3 = list.get(2);
			Book b4 = list.get(3);
			Book b5 = list.get(4);
			
			ois.close();
			fis.close();
			
			System.out.println("Book id : "+b1.book_id);
			System.out.println("Book title : "+b2.book_title);
			System.out.println("Book Author : "+b3.book_author);
			System.out.println("Book isbn : "+b4.book_isbn);
			System.out.println("Book pages : "+b5.book_pages);

		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
