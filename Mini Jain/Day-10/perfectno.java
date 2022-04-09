package test.java;
import java.util.Scanner;
public class perfectno {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int first=Sc.nextInt();
		System.out.println("Enter Second Number");
		int Second=Sc.nextInt();
		System.out.println("Perfect Numbers Between" + first + "and"+ Second + "are:");
		for (int i=first; i<=Second;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0)   sum=sum+j;
			}
			if (i==sum) System.out.print(i+"\t");
		}
		
		

	}

}
			
}
}
