package ex_Day04;

public class exception3 {
	
	public static void main(String[] args) {
		String name = "Java Developer";
		Integer i = new Integer(20);
		int k = 25;
		String x = "x";

		for(int o=0; o<3; o++) {
			try {
				System.out.println(name);
				System.out.println(name.charAt(k));
				System.out.println(Integer.parseInt(x));
				System.out.println("No Exception");
			} catch(ClassCastException e) {
				System.out.println(o+" ClassCastException ");
			} catch(NumberFormatException e) {
				System.out.println(o+" NumberFormatException ");
				x = "10";
			} catch(StringIndexOutOfBoundsException e) {
				System.out.println(o+" StringIndexOutOfBoundsException ");
				k = 10;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(o+" ArrayIndexOutOfBoundsException ");
			} catch(Exception e) {
				System.out.println(o+" Exception ");
			} finally {
				System.out.println(o+" Finally block");
			}
			System.out.println();
		}

	}


	
	
	
	
	
	

}
