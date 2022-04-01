
public class Sandglass_Star {

	public static void main(String[] args) {
		for (int i=9;i>=0;i--) {
			//Spaces
			for (int j=9-i;j>=1;j--) {
				System.out.print(" ");
			}
			//stars
			for (int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1;i<=8;i++) {
			for (int j=1;j<=8-i;j++) {
				System.out.print(" ");
			}
			for (int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
