package begin5;

import java.io.Serializable;

public class Textbook implements Serializable {
	private static final long serialVersionUID = 1L;

	public String Textbook_title;
	public String Textbook_author;
	public String Textbook_rating;
	public String Textbook_name;


	public Textbook() {
		Textbook_title = "0";
		Textbook_author = "Not told";		
		Textbook_rating = "Not told";
		Textbook_name = "unkown";	
	}

	public Textbook(String Textbook_title, String Textbook_author, String Textbook_rating, String Textbook_name) {

		this.Textbook_title = Textbook_title;
		this.Textbook_author = Textbook_author;
		this.Textbook_rating = Textbook_rating;
		this.Textbook_name = Textbook_name;		
	}
}	
