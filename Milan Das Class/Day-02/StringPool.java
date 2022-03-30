package j4g03.day02;

public class StringPool {

	public static void main(String[] args) {
		String n1 = "This is a text";
		String n2 = "This is a text";
		String n3 = "This is a text";
		String n4 = "Hello World";

		n2 = "This is another text";		// This assignment should be done
	}

}
/*
	This happens in case of String class only. A string pool is automatically created in the
	heap memory. The reference in create in the stack memory.

	In the stack memory a reference is created
	n1 = sp[0];
	n2 = sp[0];
	n3 = sp[0];
	n4 = sp[1];

    ConverToString = addressX

	In the heap memory a StringPool is created. This is automatically created internally.
	  +-------------------------------+
	0 | This is a text                | n1, n2, n3
	  +-------------------------------+
	1 | Hello World                   | 
	  +-------------------------------+
	2 |                               |
	  +-------------------------------+
	3 |                               |
	  +-------------------------------+

	addressX = "This is GAVS class"

	So, String class is considered mute. The String variables are immutable.
	You should not write:
		String x = "Hello World";
		x = "We are Java programmers";
		x = "This a StringPool example";

	For mutable strings, different classes is provided, such as StringBuffer and StringBuilder
*/
