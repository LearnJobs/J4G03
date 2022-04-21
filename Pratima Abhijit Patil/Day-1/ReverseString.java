public class ReverseString {
	public static void main(String[] args) {
		String name = "Hello World";
		System.out.println("Original String: "+ name);
		System.out.print("Reverse String:  ");
		
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
	}
}
