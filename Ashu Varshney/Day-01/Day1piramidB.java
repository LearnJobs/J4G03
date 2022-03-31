package learnjob;

public class Day1piramidB {
	public static void main(String []args ) {
		int spaces= 50;
		int stars= 1;
		
		for (int i=1; i<=19; i++) {
			for(int j=0; j<spaces; j++) 
				System.out.print(" ");
			for(int j=0; j<stars; j++) 
				System.out.print("*");
			System.out.println();
		
			
			if (i<=9) {
				spaces -= 1;
				stars += 2;
			}else
			{	spaces += 1;
			stars -= 2;
			}
			
		}
	
		
	}

}
