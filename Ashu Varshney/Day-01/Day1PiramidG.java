package learnjob;

public class Day1PiramidG {
	public static void main (String[]args ) {
		int spaces= 15;
		
	
		for(int i=1; i<=9; i++) {
			for (int j=1; j<=i; j++) 
				System.out.print(j);
			for (int j=1; j<=spaces; j++)
				System.out.print(" ");
			for (int j=i; j>0; j--)
				if(j!=9) {
					
				System.out.print(j);
				}
			
			spaces -= 2;
			System.out.println();
			
			}
	}

}
