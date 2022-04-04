package day01;

import java.util.Scanner;

public class CharacterTriangle5 {
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of row :");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{    
			char t=97;
			for(int j=i;j<=num;j++)
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
