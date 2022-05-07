package begin5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// Serialization
public class TextbookSerializeOut {

	public static void main(String[] args) {
		try {
			  Textbook tb1 = new Textbook("The Java Language Specification","James Gosling","4","The Java Series");
			  
			  Textbook  tb2 = new Textbook("The Java TM programming language","Ken Arnold","4.3","The Java TM Series");
			  
			  Textbook tb3 = new Textbook("Core Java An Integrated Approach","Dr. R. Nageswara Rao","3","Java Black Book");
			  
			  Textbook tb4 = new Textbook("Java The Complete Reference", "Herbert Schildt","5","Java");
			
			List<Textbook> list = new ArrayList<Textbook>();
			list.add(tb1);
			list.add(tb2);
			list.add(tb3);
			list.add(tb4);
			
			FileOutputStream fos = new FileOutputStream("TextbookObject.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(list);

			oos.close();
			fos.close();
			System.out.println("Textbook object is serialized");
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		} catch(Exception e) {
		}
	}
}	
