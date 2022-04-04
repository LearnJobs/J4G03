package Day_5;
	import java.io.Serializable;

	public class Book implements Serializable{
		private static final long serialversioUID = 1L;
	public String Book_title;
	public String Book_author;
	public String Book_rating;
	public String Book_name;

	public Book() {
		Book_title="0";
		Book_author="not told";
		Book_rating="not told";
		Book_name="unknown";
	}
	public Book(String Book_title,String Book_author,String Book_rating,String Book_name) {
		this.Book_title=Book_title;
		this.Book_author=Book_author;
		this.Book_rating=Book_rating;
		this.Book_name=Book_name;
	}
	}
	
	
	
	
	
	
	
	
	
	
	


