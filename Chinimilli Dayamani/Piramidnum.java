package day01;

public class Piramidnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int space = 50;
	    int starts = 1;
	    for(int i=0; i<=10; i++) {
	        for(int j=0; j<space; j++) 
	           System.out.print(" ");
	        for(int j=0; j<starts; j++)
	           System.out.print(i);
	   	    System.out.println();
	    	space -=1;
	    	starts +=2;
	    }

	}

}
