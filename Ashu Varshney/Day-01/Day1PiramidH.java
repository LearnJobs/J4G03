package learnjob;

public class Day1PiramidH {
	public static void main (String[] args){
		int space=0;
		for ( int i=9; i>0; i--) {
			for(int j=1; j<=i; j++) 
				System.out.print(j);
			for(int j=1; j<space;j++)
				System.out.print(" ");
			for (int j=i; j>0; j--)
				if(j!=9) {
				System.out.print(j);
				}
		
			space += 2;
			System.out.println();
			
		}
		
	}
}
