package DAY5;

import java.io.Serializable;

public class College implements Serializable {
	private static final long serialVersionUID = 1L;

	public int college_id;
	public String college_name;
	public String college_location;


	public College() {
		college_id = 0;
		college_name = "not told";
		college_location = "Not told";		
		
	}

	public College(int college_id, String college_name, String college_location) {
 
		this.college_id = college_id;
		this.college_name = college_name;
		this.college_location = college_location;
		
	}
}	
