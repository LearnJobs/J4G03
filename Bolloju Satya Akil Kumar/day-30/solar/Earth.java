package com.solarsystem.autowire;

public class Earth {

	private String diameter;
    private String surfaceArea;
    
   public String getDiameter() {
		return diameter;
	}
	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}
	public String getsurfaceArea() {
		return surfaceArea;
	}
	public void setsurfaceArea(String surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	 public void diameter() {
			System.out.println("diameter of the Earth planet:12,742 km");
		}
	public void surfaceArea() {
		System.out.println("surfaceArea of the Earth planet:510.1 million km²");
	}
}
