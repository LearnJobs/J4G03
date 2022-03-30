package j4g03.day02;

public class PiramidOutline {

	public static void main(String[] args) {
		int stars = 1;
		int spaces = 30;
		String fill = "*";
		System.out.println();
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=spaces; j++) System.out.print(" ");
			for(int j=1; j<=stars; j++) {
				if(j==1) {
					fill = "*";
				} else if(i==10) {
					fill = "*";
				} else if(j==stars) {
					fill = "*";
				} else {
					fill = " ";
				}
				System.out.print(fill);
			}
			System.out.println();
			stars += 2;
			spaces -= 1;
		}
	}

}
