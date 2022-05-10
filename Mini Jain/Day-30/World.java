package com.world.autowire;

public class World {

	private America america;
	
	private  Asia asia;
	
	 private Europe europe;

	public America getAmerica() {
		return america;
	}

	public void setAmerica(America america) {
		this.america = america;
	}

	public Asia getAsia() {
		return asia;
	}

	public void setAsia(Asia asia) {
		this.asia = asia;
	}

	public Europe getEurope() {
		return europe;
	}

	public void setEurope(Europe europe) {
		this.europe = europe;
	}
	
	public void showdata() {
		america.noOfCountries();
		System.out.println();
		asia.noOfCountries();
		System.out.println();
		europe.noOfCountries();
		}
}
