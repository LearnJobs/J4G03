public class NumberPattern {
	public static void main(String[] args) {
		
		int n = 9;
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