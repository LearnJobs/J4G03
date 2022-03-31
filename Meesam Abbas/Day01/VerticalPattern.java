public class VerticalPattern {

	public static void main(String[] args) {
		int n = 4;
		
		//upper_half
		for(int i=0;i<=n;i++) {
			//spaces
			for(int j=1;j<=i;j++)
				System.out.print("   ");
			for(int j=1;j<=2*(n-i);j++)
				System.out.print(" * ");
			System.out.println();
				
		}
		
		//lower_half
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