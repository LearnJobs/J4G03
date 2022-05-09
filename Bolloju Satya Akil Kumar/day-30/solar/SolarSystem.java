package com.solarsystem.autowire;

public class SolarSystem {

	private Earth earth;

	private Jupiter jupiter;

	public void setEarth(Earth earth) {
		System.out.println("setter inject method is executed...");
		this.earth = earth;
	}

	public void setJupiter(Jupiter jupiter) {
		System.out.println("setter inject method is executed...");
		this.jupiter = jupiter;
	}
	
	public void showdata() {
		earth.diameter();
		earth.surfaceArea();
		System.out.println();
		jupiter.diameter();
		jupiter.surfaceArea();
	}
	
}

