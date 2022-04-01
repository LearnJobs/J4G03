package com.razz1.Day2;

import java.util.Date;

public class APIIntro {

	public static void main(String[] args) {
		int m = Math.max(256,652);
		System.out.println(m);

		Date dt = new Date();
		System.out.println(dt);
		
		String str1 = new String();
		
		byte[] by = {65,66,67,68,69,70};
		String str2 = new String(by);
		System.out.println(str2);
		
		String str3 = new String(str2);
		System.out.println(str3);
		
		ConvertToString cts = new ConvertToString();
		System.out.println(cts);

		ClassB b = new ClassB();
		System.out.println(b);
	}

	}


class ConvertToString {
	public String toString() {
		return "This is GAVS class";
	}
}

class ClassA extends ConvertToString {
	public String toString() {
		return "ClassA";
	}
}

class ClassB extends ClassA {
	public String toString() {
		return "ClassB";
	}
}
