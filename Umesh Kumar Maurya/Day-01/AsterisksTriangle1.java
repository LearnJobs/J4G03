package day01;

import java.util.Scanner;

//  Draw a triangle of asterisks?               
public class AsterisksTriangle1 {
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of row :");
		int row=sc.nextInt();
		System.out.print("Enter the number of col :");
		int col=sc.nextInt();
		for(int i=0;i<=row;i++)
		{
			for(int j=i;j<=col;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
