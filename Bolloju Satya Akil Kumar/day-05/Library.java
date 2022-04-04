package begin5;

import java.io.Serializable;

public class Library implements Serializable {
	private static final long serialVersionUID = 1L;

	public String lib_id;
	public String lib_name;
	public String lib_method;
	public String  lib_location;


	public Library() {
		lib_id = "0";
		lib_name = "not told";
		lib_method = "Not told";		
		lib_location = "Not told";
			
	}

	public Library(String lib_id, String lib_name, String lib_method, String lib_location) {
 
		this.lib_id = lib_id;
		this.lib_name = lib_name;
		this.lib_method = lib_method;
		this.lib_location = lib_location;
	
	}
}	
