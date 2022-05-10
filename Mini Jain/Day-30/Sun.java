

	package com.solarsystem.autowire;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;


	public class Sun {


		public static void main(String[] args) {
			//SolarSystem solarsystem = new SolarSystem();
			//solarsystem.diameter();
			//solarsystem.surfaceArea();


			
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
			SolarSystem solarsystem= context.getBean("solarsystem", SolarSystem.class);
			
			solarsystem.showdata();
		

		}

	}


