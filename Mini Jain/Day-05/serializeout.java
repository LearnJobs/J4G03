package begin5.java;

public class serializeout {
	import java.io.*;
	import java.util.*;

	// Serialization
	public class RecordSerializeOut {

		public static void main(String[] args) {
			try {
				Record pb1 = new Record();
				Record pb2 = new Record("Chetan Bhagat","Global Library","K.D Campus");
				Record pb3 = new Record("Getting Started with Java","LearnJObs Library","LMS");
							
				List<Record> Recordlist = new ArrayList<Record>();
				Recordlist.add(pb1);
				Recordlist.add(pb2);
				Recordlist.add(pb3);
							
				FileOutputStream fos = new FileOutputStream("Record.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(Recordlist);

				oos.close();
				fos.close();
				System.out.println("Records are serialized");
			} catch(FileNotFoundException e) {
			} catch(IOException e) {
			} catch(Exception e) {
			}
		}
	}
}
