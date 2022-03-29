
public class PrimeNo2 {
	public static void main(String[] args) {
		int start = 5000;
		int end = 6000;
		boolean yn;
		int count = 0;

		for(int i=start; i<=end; i++) {
			yn = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					yn = false;
					break;
				}
			}
			if(yn) {
				System.out.print(i+" ");
				count++;
				if(count==15) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
}
