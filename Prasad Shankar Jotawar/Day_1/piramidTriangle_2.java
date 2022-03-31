package Day_1;

public class piramidTriangle_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int spaces =50;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=spaces;j++) 
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(j);
			for(int j=i-1;j>=i;j--)
			   System.out.println(j);
			   System.out.println();
			spaces--;
		}
	}

}
