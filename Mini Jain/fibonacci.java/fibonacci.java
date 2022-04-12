package day9;

public class fibonacci {

	public class Fibonacci {
		int count = 0;
		public Fibonacci() {
			int f1 = 0;
			int f2 = 1;
			System.out.print(f1 + " ");
			next(f1,f2);
		}

		public void next(int f1, int f2) {
			System.out.print(f2 + " ");
			f1 = f1+f2;
			if(++count>20) return;
			next(f2,f1);
		}
		
		public static void main(String[] args) {
			new fibonacci();
		}

	}
	

}
