package day01;

public class OutlineOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=19;col++) {
				if((row==10)||(row+col==11)||(col-row==9)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}

	}

}
