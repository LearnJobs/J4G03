package day4;



public class IntroException2 {
	public static void main(String[] args) {
		int i = 1009;
		int j = 0;
		int k = 10;
		String[] text = {"Red","Green","Blue","Magenta","Cyan","Yellow"};

		for(int n=0; n<3; n++) {
			try {
				double r = i/j;
				System.out.println(text[k]);
				System.out.println(r);
				System.out.println("There is no exception");
			} catch(NumberFormatException e) {
				System.out.println("NumberFormatException");
			} catch(ArithmeticException | StringIndexOutOfBoundsException e) {
				System.out.println("ArithmeticException");
				j = 2;
			} catch(ClassCastException | ArrayIndexOutOfBoundsException e) {
				System.out.println("ClassCastException | ArrayIndexOutOfBoundsException");
				k = 3;
			} catch(Exception e) {
				System.out.println("Exception");
			} finally {
				System.out.println("Finally block");
			}
			System.out.println();
		}
	}

}

