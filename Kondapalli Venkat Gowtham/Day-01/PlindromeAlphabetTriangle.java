package begin;

public class PlindromeAlphabetTriangle {

	public static void main(String[] args) {
		int spaces =20;
		int letter =1;
		int alphabet = 97; //ASCII value of a is 97
		for(int i=0;i<spaces;i++) {
			for(int j=0;j<spaces;j++)System.out.print(" ");
			for(int j=0;j<letter;j++)System.out.print((char)(alphabet+j));
			for(int j=letter-2;j>=0;j--)System.out.print((char)(alphabet+j));
			System.out.println();
			spaces--;
			letter++;	
		}		
}}
