package learnjob;

public class Day1PiramidF {
	public static void main(String []args) {
	
int space=50;
int num=1;
for (int i=0; i<10; i++) {
	for(int j=0;j<space; j++)
		System.out.print(" ");
	for (int j=0; j<num; j++ )
		System.out.print(i);
	System.out.println();
	
	space -= 1;
	num += 2;
	
	
}
}
}	