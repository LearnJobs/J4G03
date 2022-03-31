package Day_1;

public class triangle_abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.printf("%c",(char)(j+64));
			}
				for(int j=1;j>=1;j--)
				{
					System.out.printf("%c",(char)(j+64));
				}
			System.out.println();
		}
		
	}

}
