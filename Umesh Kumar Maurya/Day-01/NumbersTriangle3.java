package day01;

import java.util.Scanner;

                               
public class NumbersTriangle3 {
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of row :");
		int row=sc.nextInt();
		System.out.print("Enter the number of col :");
		int col=sc.nextInt();
		for(int i=1;i<=row;i++)
		{    
			int t=1;
			for(int j=i;j<=col;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(t++);
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(t-- );
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
