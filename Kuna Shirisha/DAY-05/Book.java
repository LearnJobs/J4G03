package DAY5;

	import java.io.Serializable;

	public class Book implements Serializable {		
		public static final long serialVersionUID = 1L;
		public String book_name;		
		public String libraby_name;
		public String college_name;

		public Book() {							
			book_name = "Unknown";		
			libraby_name = "Unknown";
			college_name = "Unknown";
		}

		public Book(String book, String library, String college) {
			this.book_name= book;
			this.libraby_name=library;
			this.college_name=college;
		}
	}

