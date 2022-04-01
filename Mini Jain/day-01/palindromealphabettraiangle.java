
public class palindromealphabettraiangle {
public static void main (String[] args) {
	int spaces =20;
	for(int i = 1; i <= 10; i++ )
	{
		int alphabet = 64;
		for( int j=1; j<= spaces; j++) System.out.print(" ");
		
		for( int j=1; j<= i; j++) System.out.print((char) (alphabet +j));
		
		for( int j=i-1; j>0; j--) System.out.print((char) (alphabet +j));
		System.out.println();
spaces--;

		
		
		
	}
}
}
