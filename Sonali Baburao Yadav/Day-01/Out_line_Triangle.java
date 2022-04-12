package myproject;

public class Out_line_Triangle {

	public static void main(String[] args) {
		
		 
		int n = 15;  
	      for(int i=0;i<n;i++)
	      {
	          for(int k=i;k<n;k++)
	          System.out.print("  ");
	 
	          for(int j=0;j<=2*i;j++)
	          {
	            if(j==0 || j==2*i || i==0 || i==n-1)
	            System.out.print("* ");
	            else
	            System.out.print("  ");
	          }
	 
	          System.out.println();
	      }
	}
}
