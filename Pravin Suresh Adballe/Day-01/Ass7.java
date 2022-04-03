package Day1;

public class Ass7 {

	public static void main(String[] args) {
       int n=9;
       int s=0;
        for(int i=9;i>=1; i--) {
        	for(int j=1;j<n;j++)
        		System.out.print(j);
        		for(int j=0;j<s; j++)
        			System.out.print(" ");
        			for(int j=n;j>=1; j--)
        				System.out.print(j);
        			
        			n--;
        			s+=2;
        			System.out.println();
	}
	}
}
