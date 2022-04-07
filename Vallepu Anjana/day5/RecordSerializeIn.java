package day5;

import java.io.*;					// basically this will inherit all the classes of io
import java.util.*;

public class RecordSerializeIn {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("Record.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			@SuppressWarnings("unchecked")
			List<Record> Recordlist = (List<Record>)ois.readObject();
			Record pb1 = Recordlist.get(0);
			Record pb2 = Recordlist.get(1);
			Record pb3 = Recordlist.get(2);


			ois.close();
			fis.close();

			System.out.println("Book Name    : "+pb1.book_name);
			System.out.println("Library Name : "+pb1.libraby_name);
			System.out.println("College Name : "+pb1.college_name);
			System.out.println();
			System.out.println("Book Name    : "+pb3.book_name);
			System.out.println("Library Name : "+pb3.libraby_name);
			System.out.println("College Name : "+pb3.college_name);


		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}finally {
			System.err.println("Here is Your Output::\n");
		}
	}

} 