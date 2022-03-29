package patterns;

public class Vertical_Damru_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		
		//upper half
		for(int i=0;i<=n;i++) {
			//spaces
			for(int j=1;j<=i;j++)
				System.out.print("   ");
			for(int j=1;j<=2*(n-i);j++)
				System.out.print(" * ");
			System.out.println();
				
		}
		
		//lower half
		for(int i=n; i>=1; i--) {
			for(int j=1; j<i; j++) {
			System.out.print("   ");
			}
			for(int j=0; j<=2*(n-i)+1; j++) {
			System.out.print(" * ");
			}
			System.out.println();
			}

	}

}
