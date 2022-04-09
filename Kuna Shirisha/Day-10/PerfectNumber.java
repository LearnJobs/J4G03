package DAY9;

public class PerfectNumber {

		   static boolean isPerfect(int n)
		   {
			   int sum=1;
			   
			   for(int i= 2 ;i * i <=n ;i++) {
				   
				     if(n % i ==0)
				    	 
				     {
				    	  if(i * i !=n)
				    		  sum = sum+i+n/i;
				    	  else
				    		  sum=sum+i;		    	  
				     }
			   }
			   if(sum == n && n!= 1)
				   
				    return true;
			   
			   return false;
		   }
			public static void main(String[] args) 
			{
				System.out.println("print all perfect numbers" + " numbers till 10000");
				 for(int n = 2; n< 10000; n++)
					   if(isPerfect (n))
			    System.out.println( n + "is a perfect numbers");
			 }

			}

