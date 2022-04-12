package myproject;

public class Reverse_string {

	public static void main(String[] args) {
		String name=" I AM PRACHI";
	System.out.println("Original string:"+name);
	System.out.print("Reverse String: ");
	for(int i= name.length()-1;i>=0;i--) {
		System.out.print(name.charAt(i));
	}

	}

}
