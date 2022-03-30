package day01;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1009;
		boolean yn = true;
		for(int j=1;j<1009;j++) {
			if(n%j==0) {
				yn=false;
				break;
			}
		}
        if(yn) System.out.println("1009 is prime no");
        else System.out.println("1009 is not prime no");

	}

}
