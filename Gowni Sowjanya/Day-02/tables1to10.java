package mul;
import java.util.Scanner;

public class tables1to10 {
	public tables1to10(int start, int end){
		for(int i=1; i<=10; i++) {
			for(int j=start; j<=end; j++) {
				System.out.print(padLeft(j,2) + " x " + padLeft(i,2) + " = " + padLeft((i*j),3) + "   ");
			}
			System.out.println();
		}
	}

	public String padLeft(int number, int length) {
		StringBuffer buf = new StringBuffer(String.valueOf(number));
		for(int i=buf.length(); i<length; i++) {
			buf.insert(0," ");     
		}
		return buf.toString();
	}

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     
		int start= 1;
		int end = 10;
		int temp_end=start+4;
		while(temp_end<=end) {
			new tables1to10(start, temp_end);
			start+=5;
			temp_end+=5;
			System.out.println("\n");
		}
		int remain = temp_end-end;
		temp_end-=remain;
		new tables1to10(start, temp_end);
		System.out.println();
	}
}

