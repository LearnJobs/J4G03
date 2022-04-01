package com.Shahnawaz;

import java.util.Scanner;

public class PalindromNumberOrNot {

		public static void main(String []args){

		     int no = 20,r,c,s=0;
		     c=no;
		/*System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		    no=sc.nextInt();*/

		while(no>0){
		     r=no%10;
		     s=s*10+r;
		     no=no/10;
		}
		   if(c==s){
		     System.out.println("Number is palindrom");
		  }
		else {
		}
		System.out.println("Number id not Palindrom");
		}

		}
