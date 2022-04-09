package programs;

public class PerfectNumber3  
{  
 
static boolean isPerfectNumber(int num)  
{  
 
int sum = 1;  

for (int i = 2; i * i <= num; i++)  
{  
if (num % i==0)  
{  
if(i * i != num)  
sum = sum + i + num / i;  
else  
 
sum = sum + i;  
}  
} 
if (sum == num && num != 1)  
return true;  
  
return false;  
}   
public static void main (String args[])  
{  
System.out.println("Perfect Numbers between 2 to 10000 are: ");  

for (int n = 2; n < 10000; n++)  

if (isPerfectNumber(n))  
 
System.out.println(n +" is a perfect number");  
}  
}  

