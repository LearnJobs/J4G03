package day01;

import java.util.Scanner;

public class AstrisksFrameTriangle4 {
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of row :");
		int row=sc.nextInt(); 
		for(int i=1;i<=row;i++)
		{    
			int t=0;
			for(int j=i;j<=row;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{    
				t++;
				if(t==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				t--;
				if(t==1)
					System.out.print("*");
				else
					System.out.print(" ");
			
			}
			System.out.println(" ");
		}
		for(int i=0;i<=row*2;i++)
		{
			System.out.print("*");
		}
		sc.close();
	}

}
