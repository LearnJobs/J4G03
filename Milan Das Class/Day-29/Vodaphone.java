/**
 * 
 */
package com.tcn.ioc;

public class Vodaphone implements Sim {
	@Override
	public void Dialing() {
		System.out.println("Dialing Vodaphone ISP");
		System.out.println("Vodaphone working..");
	}

	@Override
	public void Talk() {
		System.out.println("Talking Vodaphone ISP");
		System.out.println("Vodaphone working..");
	}

}
