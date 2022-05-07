package begin5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
// Deserialization
public class BookSerializeIn {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("BookObject.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			List<Book> list = (List<Book>)ois.readObject();
			Book b1 = list.get(0);
		    Book b2 = list.get(1);
		    Book b3 = list.get(2);
			Book b4 = list.get(3);

			ois.close();
			fis.close();

		
			System.out.println(b2.book_id);
			System.out.println(b2.book_title);
			System.out.println(b2.book_author);
			System.out.println(b2.book_isbn);
			System.out.println(b2.book_pages);
			
		

		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}