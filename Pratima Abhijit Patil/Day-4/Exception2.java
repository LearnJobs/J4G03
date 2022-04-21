public class Exception2 {

	public static void main(String[] args) {
		int i =1009;
		int j =0;
		int k=10;
		String[] text= {"Red","Green","Blue","Magenda","Cyan","Yello"};
		for(int n=0;n<3;n++) {
		try {
			double r=i/j;
			System.out.println(text[k]);
			System.out.println(r);
			System.out.println("There is no exception");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}catch(ArithmeticException e) {
			System.out.println("ArithmaticException");
			j=2;}
			catch ( ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundException");
			k=3;}
			finally {System.out.println("This is from the fnally block");}
			System.out.println();
		}

	
	}}