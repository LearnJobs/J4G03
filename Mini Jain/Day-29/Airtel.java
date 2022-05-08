
	package com.tcn.ioc;

	public class Airtel implements Sim {

		@Override
		public void Dialing() {
			System.out.println("Dialing Airtel ISP");
			System.out.println("Airtel working..");
		}

		@Override
		public void Talk() {
			System.out.println("Talking Airtel ISP");
			System.out.println("Airtel working..");
		}

	}

