package com.tcn.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
//		Vodaphone voda = new Vodaphone();
//		voda.Dialing();
//		voda.Talk();

//		Airtel air = new Airtel();
//		air.Dialing();
//		air.Talk();

//		Jio jio = new Jio();
//		jio.Dialing();
//		jio.Talk();

//		Sim sim = new Vodaphone();
//		sim.Dialing();
//		sim.Talk();

//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Airtel air = (Airtel)context.getBean("air");
//		air.Dialing();
//		air.Talk();

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Sim sim = (Sim)context.getBean("sim");
		Sim sim = context.getBean("sim", Sim.class);
		sim.Dialing();
		sim.Talk();
	}

}
