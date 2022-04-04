package DAY5;
import java.util.*;

class PyramidTriangleWithNumberPattern
{
 public static void main(String args[])
 {
 int i,j,n;
 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no of lines");
 n=sc.nextInt();
     for(i=1;i<=n;i++)
     {
 
        for(j=1;j<=n-i;j++)
         {
     System.out.printf(" ");
 } 
        for(j=1;j<=i;j++)
         {
     System.out.printf("%d",j);
 } 
        for(j=i-1;j>=1;j--)
         {
     System.out.printf("%d",j);
 } 
 
         System.out.println();
     }
 }
}
