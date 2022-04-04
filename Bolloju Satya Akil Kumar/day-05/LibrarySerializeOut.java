package begin5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// Serialization
public class LibrarySerializeOut {

	public static void main(String[] args) {
		try {
			   Library c1 = new Library(518,"Sasi","Central Library","Tadepalligudem");
			  
			   Library  c2 = new Library(501,"Srinivasa","Srin Library","Amalapuram");
			  
			   Library c3 = new Library(502,"Jntuk","Jntu Library","Kakinada");
			  
			   Library  c4 = new Library(509,"Vasavi", "vLibrary","Hyderabad");
			
			List<Library> list = new ArrayList<Library>();
			list.add(c1);
			list.add(c2);
			list.add(c3);
			list.add(c4);
			
			FileOutputStream fos = new FileOutputStream("LibraryObject.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(list);

			oos.close();
			fos.close();
			System.out.println("Library object is serialized");
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		} catch(Exception e) {
		}
	}
}	
