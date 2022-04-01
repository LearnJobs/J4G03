package com.razz1.Day4;

import java.util.Scanner;

public class TimeException {
	Scanner sc=new Scanner(System.in);
	int h=23;
	int m=59;
	int s=47;
	
	public TimeException() {
		 for(int i=0;i<3;i++) {
			try {
				int h=25;
				int m=69;
				int s=68;
				if(h>24 && h<1) throw new HourException("The hour is not in the range of 1 to 24,i.e["+h+"]");
				else if(m>60 && m<1) throw new MinuteException("The minute is not in the range of 1 to 60,i.e["+m+"]");
				else if(s>60 && s<1)  throw new SecondException("The second is not in the range of 1 to 60,i.e["+s+"]");
				System.out.println("hh:mm:ss =" +h+":"+m+":"+s+": is correct");
			} catch(HourException e) {
				System.out.println(  " Invalid Input: "+e.getMessage());
			} catch(MinuteException e) {
				System.out.println( " Invalid Inpu: "+e.getMessage());
			} catch( SecondException e) {
				System.out.println(" Invalid Inpu: "+e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		new TimeException();
	}

}

class TimesException extends Exception {
	private static final long serialVersionUID = 1L;
	public TimesException() {super();}
	public TimesException(String mes) {super(mes);}
}

class HourException extends TimesException {
	private static final long serialVersionUID = 1L;
	public HourException() {super();}
	public HourException(String mes) {super();}
}

class MinuteException extends TimesException{
	private static final long serialVersionUID = 1L;
	public MinuteException() {super();}
	public MinuteException(String mes) {super(mes);}
}

class SecondException extends TimesException {
	private static final long serialVersionUID = 1L;
	public SecondException() {super();}
	public SecondException(String mes) {super(mes);}
}



