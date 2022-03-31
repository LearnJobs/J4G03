package Day_1;

public class piramidtriangleNumber {

	public static void main(String[] args) 
		// TODO Auto-generated method stubzfor
	{
		for(int i=1;i<=9;i++)
		 {
		for(int j=0; j<=9-i; j++) 
			System.out.print(" ");
		for(int j=0; j<=i-1; j++)  
		{
			System.out.print(i+" ");
		}
		System.out.println( );
		 }
	}
}

