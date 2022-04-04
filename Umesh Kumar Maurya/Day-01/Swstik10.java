package day01;

import java.util.Scanner;

public class Swstik10 {
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.print(" Enter the number  :");
	    int num=sc.nextInt();    
	  
	    
	    for(int i=0;i<=num;i++)
	    {
	    	for(int j=0;j<=num;j++)
	    	{ 	
	    		if(j%2==0)
	    		{
	    			if(i==0 || i==num/2 || j==0 && i>num/2 )
	    				System.out.print("*");
	    			else
	    				System.out.print(" ");
	    		}
	    		else
	    			System.out.print(" ");
	   		}
	     		
	    	for(int j=0;j<=num;j++)
	    	{  
	    		if(j%2==0 || j==num)
	    		{  		
	    			if(j==0 || i==num ||i==num/2 || i<=num/2 && j==num   ) 
	    		   			System.out.print("*");
	    		   		else
	    		   			System.out.print(" ");
	    		}
	    		else
	    			System.out.print(" ");
	    	}
	    	System.out.println(" ");
	    }
	    
	    
	    
	    
	    sc.close();
		
	}

}
