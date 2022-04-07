package programs;

import java.util.Scanner;

public class triangleonetonine 
{            
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in); //Taking rows value from the user    
      System.out.println("Enter the number of rows: ");    
      int rows = sc.nextInt();         
      for (int i = 1; i <= rows; i++) 
      {
          for (int j = 1; j <= i; j++)
          {
              System.out.print(i);
          }
          for (int j = i-1; j >=1 ; j--) {
			
		
             
          System.out.println(j);
      }         
      sc.close();
  }}}

