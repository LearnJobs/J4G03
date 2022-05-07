package com.pharma.ioc;

public class Mankind implements PharmaCompany {

	@Override
	public void product() {
		System.out.println("Mankind:Number of Products are 93");

	}

	@Override
	public void salesperson() {
		 System.out.println("Mankind:Number of SalesPersons are 3,000");

	}
}
