package DAY1;

public class TriangleWithDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
	       for(int i=1; i<=n; i++) {
	           //spaces
	           for(int j=1; j<=n-i; j++) {
	               System.out.print("   ");
	           }
	 
	           //first part
	           for(int j=i; j>=1; j--) {
	               System.out.print(" "+(i-1)+" ");
	              
	           }
	 
	           //second part
	           for(int j=2; j<=i; j++) {
	               System.out.print(" "+(i-1)+" ");
	              
	           }
	           System.out.println();
	       }

	}


}
