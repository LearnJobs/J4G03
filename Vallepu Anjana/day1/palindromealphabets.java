package programs;

import java.util.Scanner;

public class palindromealphabets {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);//create a scanner object
		System.out.println("Enter the number of rows");
		int rows=scan.nextInt();
		int i,j;
		i=1;
		while(i<=rows){
		j=1;
		  while(j<=rows-i){//print space 
		  System.out.print(" ");
		  j++;
		  }
		 
		   j=1;
		   while(j<=i){//print left site pattern
		  System.out.print((char)(j+97));
		   j++;
		    }
		   j=i-1;
		   while(j>=1){//print right site pattern
		  System.out.print((char)(j+97));
		   j--;
		}
		i++;
		System.out.println();
		}
		}
		}