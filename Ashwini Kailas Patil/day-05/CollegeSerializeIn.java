package begin5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
// Deserialization
public class CollegeSerializeIn {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("CollegeObject.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			List<College> list = (List<College>)ois.readObject();
			College c1 = list.get(0);
			College c2 = list.get(1);
			College c3 = list.get(2);
			College c4 = list.get(3);

			ois.close();
			fis.close();

		
			System.out.println(c2.college_id);
			System.out.println(c2.college_name);
			System.out.println(c2.college_location);
			
		

		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}