

	package com.solarsystem.autowire;

	public class Jupiter {

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
			System.out.println("diameter of the Jupiter planet:143,000 km");
		}
		public void surfaceArea() {
			System.out.println("surfaceArea of the Jupiter planet:61.42 billion km²");

}
}