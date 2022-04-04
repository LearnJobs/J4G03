package begin5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
// Deserialization
public class LibrarySerializeIn {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("LibraryObject.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			List<Library> list = (List<Library>)ois.readObject();
			Library c1 = list.get(0);
			Library c2 = list.get(1);
			Library c3 = list.get(2);
			Library c4 = list.get(3);

			ois.close();
			fis.close();

		
			System.out.println(c2.lib_id);
			System.out.println(c2.lib_name);
			System.out.println(c2.lib_method);
			System.out.println(c2.lib_location);
		
			
		

		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}