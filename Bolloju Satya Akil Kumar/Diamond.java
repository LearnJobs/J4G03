package begin;

public class Diamond {
	public static void main(String[] args) {
		int spaces = 50;
		int stars = 1;
		
		for(int i=0;i<=22;i++) {
			for(int j=0;j<spaces;j++)
				System.out.print(" ");
			for(int j=0;j<stars;j++)
				System.out.print("*");
			System.out.println();
			if(i<=10) {
				spaces -= 1;
				stars +=2;
				}
				else {
					spaces += 1;
					stars  -= 2;
				}
		}
}}