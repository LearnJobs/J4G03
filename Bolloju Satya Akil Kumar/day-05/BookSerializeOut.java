package begin5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// Serialization
public class BookSerializeOut {

	public static void main(String[] args) {
		try {
			   Book b1 = new Book(" 5.1.2.","The Java Language Specification","James Gosling","9780201310085","600");
			  
			  Book b2 = new Book("3.1.2","The Java TM programming language","Ken Arnold","0785342349801","891");
			  
			  Book b3 = new Book("5.4.3","Core Java An Integrated Approach","Dr. R. Nageswara Rao","9788177228366","720");
			  
			  Book b4 = new Book("5.3.2","Java The Complete Reference", "Herbert Schildt","9781260440232","1248");
			
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
			System.out.println("Book object is serialized");
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		} catch(Exception e) {
		}
	}
}	
