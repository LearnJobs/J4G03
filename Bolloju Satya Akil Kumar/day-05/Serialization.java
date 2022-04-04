package begin5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialization {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("Serial.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			List<Object> list = new ArrayList<Object>();
			list.add(new Book(512,"The Java Language Specification","James Gosling","9780201310085",600));
			list.add(new Library(518,"Sasi","Central Library","Tadepalligudem"));
			list.add(new College(5,"SRI PRAKASH COLLEGE OF ENGG","TUNI"));
			
			oos.writeObject(list);
			
			oos.close();
			fos.close();
		} catch(Exception e) {
		}

	}

}
