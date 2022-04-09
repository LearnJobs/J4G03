package day10;

public class Perfectnum {
	static boolean isPerfect(int n) {
		int sum =1;
		for(int i=2; i*i<n; i++) {
			if(n%i ==0) {
				if((i*i)!=n) {
					sum = sum + i + n/1;
				}
				else
					sum=sum+i;
				
				}
			}
			if(sum == n && n!=1) {
				return true;
			}
			return false;
					
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("all perfect number");
		for(int n=2;n<1000; n++) {
			if(isPerfect(n)) {
				System.out.println(n);
			}
		}

	}

}

	
