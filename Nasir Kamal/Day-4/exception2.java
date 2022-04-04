package exception2Day4;

public class exception2 {

	
	
	public static void main(String[] args) {
		int i=1009;
		int j=0;int k=10;
		String [] text= {"white","green","blue","kamal","cyan","yellow"};
		for(int n=0;n<3;n++) {
			try {
				double r=i/j;
				System.out.println(text[k]);
				System.out.println(r);
				System.out.println("there is no exception");
			}catch(NumberFormatException e) {
				System.out.println("NumberFormatException");
			}catch(ArithmeticException | StringIndexOutOfBoundsException e) {
				System.out.println("ArithmeticException");
				j=2;
			}catch(ClassCastException | ArrayIndexOutOfBoundsException e) {
				System.out.println("classcastException");
				k=3;
			}catch(Exception e) {
				System.out.println("Exception");
			}
			finally {
				System.out.println("finally block");
			}
			System.out.println();
		}

	}


	
	
	
	
	
}
