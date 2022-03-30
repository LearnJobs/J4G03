package day01;

public class Piramd {
	public static void main(String[] args) {
	    int space = 50;
	    int starts = 1;
	    for(int i=1; i<=10; i++) {
	        for(int j=0; j<space; j++) System.out.println(" ");
	        for(int j=0; j<starts; j++)System.out.println("*");
	   	    System.out.println();
	    	space -=1;
	    	starts +=2;
	    }   
	
	}
}
