package com.pharma.ioc;

public class Cipla implements PharmaCompany {

	@Override
	public void product() {
		System.out.println("Cipla:Number of Products are 180");

	}

	@Override
	public void salesperson() {
		 System.out.println("Cipla:Number of SalesPersons are 5,000");

	}

}
