package com.razz1;

public class TriangleStars {

	public static void main(String[] args) {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=19;col++) {
				if((row==10)||(row+col==11)||(col-row==9)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
				System.out.println();
			
		}

	}

}
