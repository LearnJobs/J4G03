package day04;

public class Expe1 {

	public static void main(String[] args) {
		int i = 1000;
		int j = 0;
		int k = 10;
        String[] text = {"red", "green","blue","magenta","cyan"};
        for(int n =0; n<3; n++) {
        	try {
        		double r =i/j;
        		System.out.println(text[k]);
        		System.out.println(r);
        		System.out.println("there r no expection");
        	}catch (NumberFormatException e) {
        		System.out.println("NumberFormatException");
        	}catch (ArithmeticException e) {
        		System.out.println("ArithmeticException");
        		j=2;
         	}catch (ClassCastException | StringIndexOutOfBoundsException e) {
         		System.out.println("ClassCastException | StringIndexOutOfBoundsException");
         		k=3;
         	}catch (Exception e) {
         		System.out.println("Exception");
         	}finally {
         		System.out.println("finally block");
         	}
        }
	}

}
