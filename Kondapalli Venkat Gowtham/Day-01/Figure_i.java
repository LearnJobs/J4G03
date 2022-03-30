package begin;

public class Figure_i {

	public static void main(String[] args) {
		int spaces =1;
		int stars = 17;
		
		for(int i=17;i>0;i--) {
			for(int j=0;j<spaces;j++)
				System.out.print(" ");
			for(int j=stars;j>0;j--)System.out.print("*");			
			System.out.println();
			if(i<=9) {
				spaces -= 1;
				stars +=2;
				}
				else {
					spaces += 1;
					stars  -= 2;
				}
		}
	}
}
