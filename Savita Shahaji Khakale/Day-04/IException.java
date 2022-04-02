package Day4;

public class IException {

	public static void main(String[] args) {
		int i = 1009;
		int j = 0;
		String[] text = {"pink","Green","purple"};
		
		try {
			double r = i/j;
			System.out.println(text[10]);
			System.out.println(r);
			System.out.println("There is no exception");
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch(Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally block");
		}

		try {
			System.out.println("Some text");
		} finally {
			System.out.println("This is from the finally block");
		}


	}
}
