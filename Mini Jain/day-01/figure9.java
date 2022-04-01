
public class figure9 {

	public static void main(String[] args) {
		int spaces = 16;
		for( int i=1; i<=9; i++) {
			for( int j=1; j<=i; j++ ) System.out.print(j);

			for( int j=1; j<=spaces; j++ ) System.out.print(" ");
			for( int j=i; j>0; j-- ) System.out.print(j);
			spaces-=2;
			System.out.println();
		}

	}

}
