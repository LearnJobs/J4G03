package DAY5;

	import java.io.Serializable;

	public class Book implements Serializable {		
		private static final long serialVersionUID = 1L;
		
		public int book_id;
		public String book_title;
		public String book_author;
		public String book_isbn;
		public int book_pages;

		
           public Book() {	
			
		    book_id  = 0;
			book_title = "Not told";
			book_author = "Not told";
			book_isbn = "Not told";
			book_pages = 0;
		}

		public Book(int book_id, String book_title, String book_author,String book_isbn, int book_pages) {
			this.book_id= book_id;
			this.book_title=book_title;
			this.book_author=book_author;
			this.book_isbn=book_isbn;
			this.book_pages=book_pages;
		}

	}

