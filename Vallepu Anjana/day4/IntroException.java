package day4;



public class IntroException {
	public static void main(String[] args) {
		int i = 1009;
		int j = 0;
		String[] text = {"Red","Green","Blue","Magenta","Cyan","Yellow"};
		
		try {
			double r = i/j;
			System.out.println(text[10]);
			System.out.println(r);
			System.out.println("There is no exception");
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch(ArithmeticException | StringIndexOutOfBoundsException e) {
			System.out.println("ArithmeticException");
		} catch(ClassCastException | ArrayIndexOutOfBoundsException e) {
			System.out.println("ClassCastException | ArrayIndexOutOfBoundsException");
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

		try {
			System.out.println("Some text");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException");
		}

	}
}

