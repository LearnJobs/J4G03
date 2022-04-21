public class IntroException {

	public static void main(String[] args) {
		int i =1009;
		int j =0;
		String[] text= {"Red","Green","Blue","Magenda","Cyan","Yello"};
		
		try {
			double r=i/j;
			System.out.println(10);
			System.out.println(r);
			System.out.println("There is no exception");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}catch(ArithmeticException e) {
			System.out.println("ArithmaticException");}
			catch ( ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundException");
			}finally {
				System.out.println("Finally block");
			}try {System.out.println("some text");
			}finally {System.out.println("This is from the fnally block");
			}try {System.out.println("some text");
			}catch(IndexOutOfBoundsException e) {
				System.out.println("IndexOutOfBoundException");
			}
		}

	
}