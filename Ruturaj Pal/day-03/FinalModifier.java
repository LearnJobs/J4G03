package com.razz1.Day3;

public class FinalModifier {
	double PI;
	static String name;

	public FinalModifier() {
		PI = 3.141;
		name = "Narendra Modi";
	}

	public void setPI(double pi) {
		PI = pi;
	}

	public void setName(String nm) {
		name = nm;
	}

	public static void main(String[] args) {
		Different d = new Different();
		
	}

	public double calculate() {
		double result = 212/7;
		return result;
	}
}

// FinalModifier.name = "";

class Different {
	public double calculate() {
		double result = 22/7;
		return result;
	}
}
