package learnjob;

public class Day1piramidI {
	public static void main (String[]args) {
		int space = 30;
		int star = 17;
		for (int i=9; i>0; i--) {
			for (int j=0; j<space; j++)
				System.out.print(" ");
			for(int j=0; j<star; j++)
				System.out.print("*");
			System.out.println();
		
			space += 1;
			star -= 2;	
		}	
		int space1 = 37;
		int star1 =3;
		for(int k=0; k<9; k++) {
			for (int l= 0; l<space1; l++)
				System.out.print(" ");
			for (int l=0; l<star1; l++) 
				System.out.print("*");
			System.out.println();
		star1 += 2;
			space1 -= 1;
			
			}	
	}
}
