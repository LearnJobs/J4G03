package myproject;

public class prime_number {

	public static void main(String[] args) {
		int n=1009;
		boolean yn= true;
		for(int j=2;j<n;j++) {
			if(n%j==0) {
				yn=false;
				break;
			}
		}
 if (yn)System.out.println(n+ "is a prime number");
 System.out.println(n+"is not prime number");
	}

}
