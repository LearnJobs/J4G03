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

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("BookObject.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			List<Book> list = (List<Book>)ois.readObject();
			Book b1 = list.get(0);
			Book b2 = list.get(1);
			Book b3 = list.get(2);
			ois.close();
			fis.close();
			System.out.println("Book Name : "+b1.book_name);
			System.out.println("Library Name : "+b2.libraby_name);
			System.out.println("College Name : "+b3.college_name);

		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Output");
		}
	}

}
