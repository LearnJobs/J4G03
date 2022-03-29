package abc;

public class Outline_triangle {

	public static void main(String[] args) {
		
		 
		int n = 10;  // Number of rows.
		 
	      //Outer Loop for number of Rows
	      for(int i=0;i<n;i++)
	      {
	          for(int k=i;k<n;k++)
	          System.out.print("  ");
	 
	          // We run loop till j = 2*i to print odd no. of stars.
	          for(int j=0;j<=2*i;j++)
	          {
	            // We print '*' for first and last column of each row.
	            // and complete for the last row 
	            if(j==0 || j==2*i || i==0 || i==n-1)
	            System.out.print("* ");
	            // Or we print blank space
	            else
	            System.out.print("  ");
	          }
	 
	          System.out.println();
	      }
	}

}
