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
		    BookSerialize bs1= new Book("");
		    BookSerialize bs2= new Book("Java Grammar","XYZ","Apoorva Degree college");
		    BookSerialize bs3 = new Book("Java Grammar","XYZ","MallaReddy Institue of college");
						
			List<BookSerialize> Booklist = new ArrayList<BookSerialize>();
			list.add(bs1);
			list.add(bs2);
			list.add(bs3);
						
			FileOutputStream fos = new FileOutputStream("BookSerializeOut.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(Booklist);

			oos.close();
			fos.close();
			System.out.println("Books are serialized");
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		} catch(Exception e) {
		}
	}
}
