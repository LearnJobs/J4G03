package begin5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
// Deserialization
public class TextbookSerializeIn {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("TextbookObject.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			List<Textbook> list = (List<Textbook>)ois.readObject();
			Textbook tb1 = list.get(0);
			Textbook tb2 = list.get(1);
			Textbook tb3 = list.get(2);
			Textbook tb4 = list.get(3);

			ois.close();
			fis.close();

			System.out.println(tb1.Textbook_title);
			System.out.println(tb1.Textbook_author);
			System.out.println(tb1.Textbook_rating);
			System.out.println(tb1.Textbook_name);
			
			System.out.println(tb2.Textbook_title);
			System.out.println(tb2.Textbook_author);
			System.out.println(tb2.Textbook_rating);
			System.out.println(tb2.Textbook_name);
			
			System.out.println(tb3.Textbook_title);
			System.out.println(tb3.Textbook_author);
			System.out.println(tb3.Textbook_rating);
			System.out.println(tb3.Textbook_name);
			
			System.out.println(tb4.Textbook_title);
			System.out.println(tb4.Textbook_author);
			System.out.println(tb4.Textbook_rating);
			System.out.println(tb4.Textbook_name);

		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}