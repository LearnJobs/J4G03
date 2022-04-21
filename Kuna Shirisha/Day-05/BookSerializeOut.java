package DAY5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


// Serialization
public class BookSerializeOut {


	public static void main(String[] args) {
		try {
		    Book b1=  new Book(300,"The Java Language Specification","James Gosling","201310085",600);
		    Book b2=  new Book(301,"The html Language Specification","Tim Berners-Lee","201310085",600);
		    Book b3 = new Book(302,"The Python Language Specification","Guido van Rossum","201310085",600);
		    Book b4 = new Book(303,"The c Language Specification","Dennis Ritchie","201310085",600);
		    Book b5 = new Book(304,"The c++ Language Specification","Bjarne Stroustrup","201310085",600);
						
			List<Book> list = new ArrayList<Book>();
			list.add(b1);
			list.add(b2);
			list.add(b3);
			list.add(b4);
			list.add(b5);
			
						
			FileOutputStream fos = new FileOutputStream("BookSerializeOut.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(list);

			oos.close();
			fos.close();
			
			System.out.println("Book Object is serialized");
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		} catch(Exception e) {
		}
	}
}
