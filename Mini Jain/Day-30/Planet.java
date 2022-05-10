package com.world.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Planet {

	public static void main(String[] args) {
		//World world = new World();
		//world.noOfCountries();
		

		
		ApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
	
		World world= context.getBean("world", World.class);
		
		world.showdata();
	}

}
