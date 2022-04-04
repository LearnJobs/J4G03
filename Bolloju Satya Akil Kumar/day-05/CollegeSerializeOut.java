ppackage begin5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// Serialization
public class CollegeSerializeOut {

	public static void main(String[] args) {
		try {
			   College c1 = new  College(6,"Sasi Institute of tech and engg","Tadepalligudem");
			  
			   College c2 = new  College(8,"srinivasa institute of tech and engg","Amalapuram");
			  
			   College c3 = new  College(9,"LENORA COLLEGE OF ENGG","RAMPACHODAVARAM");
			  
			   College c4 = new  College(5,"SRI PRAKASH COLLEGE OF ENGG","TUNI");
			
			List<College> list = new ArrayList<College>();
			list.add(c1);
			list.add(c2);
			list.add(c3);
			list.add(c4);
			
			FileOutputStream fos = new FileOutputStream("CollegeObject.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(list);

			oos.close();
			fos.close();
			System.out.println("College object is serialized");
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		} catch(Exception e) {
		}
	}
}	
