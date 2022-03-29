/*
 * Prime Number is a number that is divisible by 1 and the number itself.
 * 
 * To say if 1009 is a prime number, I have divide 1009 by 2 to 1008 and check
 * the reminder. If the reminder becomes 0, then it is not a prime number. 
 */
public class PrimeNo {
	public static void main(String[] args) {
		int n = 1009;
		boolean yn = true;
		for(int j=2; j<n; j++) {
			if(n%j==0) {
				yn = false;
				break;
			}
		}
		if(yn) System.out.println(n+" is a prime number");
		else   System.out.println(n+" is not a prime number");
	}
}
