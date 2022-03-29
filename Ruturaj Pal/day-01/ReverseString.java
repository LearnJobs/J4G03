package com.razz1;

public class ReverseString {

	public static void main(String[] args) {
		String name="Hello world";
		System.out.println("given string:"+name);
		System.out.println("Reverse sting:");
		for(int i=name.length()-1;i>=0;i--) {
				System.out.println(name.charAt(i));
		}

	}

}
