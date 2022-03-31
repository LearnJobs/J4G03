package Day1;

public class Ass5{

	public static void main(String[] args) {
		 int n = 7;
		 String[] array = {"a","b","c","d","e","f","g"};
	       for(int i=1; i<=n; i++) {
	       
	           for(int j=1; j<=n-i; j++) {
	               System.out.print("   ");
	           }
	 
	           for(int j=2; j<=i; j++) {
	               System.out.print(" "+array[j-1]+" ");
	           }

	           for(int j=i; j>=1; j--) {
	               System.out.print(" "+array[j-1]+" ");
	           }
	           
	           System.out.println();
	       }
	}

}