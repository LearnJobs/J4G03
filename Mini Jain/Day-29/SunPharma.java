package com.pharma.ioc;

public class SunPharma implements PharmaCompany {

	@Override
	public void product() {
		System.out.println("SunPharma:Number of Products are 200");
	


	}

	@Override
	public void salesperson() {
     System.out.println("SunPharma:Number of SalesPersons are 10,000");
	
	}
}
