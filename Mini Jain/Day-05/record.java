package begin5.java;

public class record {
	import java.io.Serializable;

	public class Record implements Serializable {		// inherit an Abstract Class Serializable.
		
		public String book_name;		
		public String libraby_name;
		public String college_name;

		public Record() {								// Non-Parametrised Constructor.
			book_name = "ShreeMad Bhagwat Geeta";		// by default the object take this when no input is given.
			libraby_name = "A to Z library";
			college_name = "Global Institute of Technology and Management";
		}

		public Record(String book, String library, String college) {	// parametrised constructor.
			this.book_name= book;
			this.libraby_name=library;
			this.college_name=college;
		}
	}
}
