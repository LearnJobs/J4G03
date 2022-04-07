package programs;

import java.util.Scanner;

public class swathiksymbol {
	  
	     
	    public static void main (String[] args)  
	    {  
	        int rows, cols;  
	        Scanner sc = new Scanner(System.in);  
	        System.out.println("Please enter odd numbers for rows and colums to get perfect Swastika.");  
	        System.out.println("Enter total rows");  
	        rows = sc.nextInt();  
	        System.out.println("Enter total colums");  
	        cols = sc.nextInt();  
	          
	    
	        sc.close();  
	          
	         
	        designSwastika(rows, cols);  
	    }  
	      
	    static void designSwastika(int rows, int cols)  
	    {  
	        for (int u = 0; u < rows; u++) {  
	            for (int v = 0; v < cols; v++)  
	            {  
	                
	                if (u < rows / 2)  
	                {  
	                    
	                    if (v < cols / 2)  
	                    {  
	                        
	                        if (v == 0)   
	                        {  
	                            System.out.print("*");  
	                        }  
	                          
	                        else   
	                        {  
	                            System.out.print(" "+ " ");  
	                        }  
	                    }  
	                    
	                    else if (v == cols / 2)   
	                    {  
	                        System.out.print(" *");  
	                    }  
	                    else  
	                    {  
	                          
	                        if (u == 0)  
	                            System.out.print(" *");  
	                    }  
	                }  
	               
	                else if (u == rows / 2) {  
	                    System.out.print("* ");  
	                }  
	                else  
	                {  
	                     
	                    if (v == cols / 2 || v == cols - 1)  
	                    {  
	                        System.out.print("* ");  
	                    }  
	                    else if (u == rows - 1)  
	                    {  
	                        
	                        if (v <= cols / 2 || v == cols - 1)   
	                        {  
	                            System.out.print("* ");  
	                        }  
	                        else {  
	                            System.out.print(" "+ " ");  
	                        }  
	                    }  
	                    else  
	                    System.out.print(" "+" ");  
	                }  
	            }  
	            System.out.print("\n");  
	        }  
	    }  

}
