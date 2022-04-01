package com.razz1.Day3;

public class TimeValidate {
public TimeValidate(int hh,int mm,int ss) {
	if(hh<1||hh>23) {
		System.out.println("hour is wrong");
	}if(mm<1||mm>60) {
		System.out.println("minute is wrong");
	}if(ss<1||ss>60) {
		System.out.println("second is wrong");
	}
}
public static void main(String[] args) {
	new TimeValidate(22,33,66);
}
}
