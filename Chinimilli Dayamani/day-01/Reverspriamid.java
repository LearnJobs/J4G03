package day01;

public class Reverspriamid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space = 30;
		int start = 17;
		for(int i=9;i>=0;i--) {
			for(int j=0;j<space; j++)
				System.out.print("  ");
			for(int j=0;j<start; j++)
				System.out.print(" *  ");
			System.out.println();
            
			space +=1;
			start -=2;
		}
		int space1 = 37;
		int start1 = 3;
		for(int k=0; k<9; k++) {
			for(int l=0;l<space1; l++)
				System.out.print("  ");
			for(int l=0;l<start1; l++)
				System.out.print(" * ");
			System.out.println();
            
			space -=1;
			start +=2;
		}

	}

}
