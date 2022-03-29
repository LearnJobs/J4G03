package patterns;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		 
	       //upper part
	       for(int i=1; i<=n; i++) {
	           //spaces
	           for(int j=1; j<=n-i; j++) {
	               System.out.print("   ");
	           }
	           for(int j=1; j<=2*i-1; j++) {
	               System.out.print(" * ");
	           }
	           System.out.println();
	       }
	 
	       //lower part
	       for(int i=n; i>=1; i--) {
	           //spaces
	           for(int j=1; j<=n-i; j++) {
	               System.out.print("   ");
	           }
	           for(int j=1; j<=2*i-1; j++) {
	               System.out.print(" * ");
	           }
	           System.out.println();
	       }

	}

}
