public class Piramid {
	public static void main(String[] args) {
		int spaces = 50;
		int stars = 1;

		for(int i=1; i<=10; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=0; j<stars; j++)  System.out.print("*");
			System.out.println();
			spaces -= 1;
			stars += 2;
		}
	}
}
