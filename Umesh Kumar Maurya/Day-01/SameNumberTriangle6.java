package day01;

import java.util.Scanner;

public class SameNumberTriangle6 {
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of row :");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{    
			
			for(int j=i;j<num;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(i);
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
