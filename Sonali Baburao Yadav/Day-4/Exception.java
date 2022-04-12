package day4;

public class Exception {

	public static void main(String[] args) {
     String name ="java Developer";
     Integer i=new Integer(20);
     int k =25;
     String x="x";
     for(int o=0;o<3;o++) {
    	 
     
     try {
    	 System.out.println(name);
    	 System.out.println(name.charAt(k));
    	 System.out.println(Integer.parseInt("x"));
    	 System.out.println("NO EXCEPTIOn");
     }  catch(ClassCastException e) {
    	 System.out.println(o+" ClassCastExeption");
		}catch(NumberFormatException e) {
			System.out.println(o+"NumberFormatException");
			x="10";
		}catch (StringIndexOutOfBoundsException e)
     {System.out.println(o+"StringIndexOutOfBoundException");
     k=10;}
			catch ( ArrayIndexOutOfBoundsException e) {
				System.out.println(o+"ArrayIndexOutOfBoundException");
			}
    	 finally {
    		 System.out.println("Finally block");}
     System.out.println();

	}

	}}
