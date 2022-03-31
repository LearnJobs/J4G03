package learnjob;

public class Day1PiramidC {
	public static void main(String[]args) {

int space=50;
for(int i=1; i<=9; i++) {
	for(int j=1; j<space;j++)
		System.out.print(" ");
	for(int j=1; j<=i; j++ ) 
		System.out.print(j);
	for(int j=i-1; j>=1; j--)
		System.out.print(j);
	
	
	

	
	System.out.println();
	space -= 1;	
}
}
}


