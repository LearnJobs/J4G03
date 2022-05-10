
	package com.tcn.autowire;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Body {

		public static void main(String[] args) {
//			Human human = new Human();
//			human.startPumping();

			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			Human human = context.getBean("human", Human.class);
			human.startPumping();
			human.leverStatus();
		}

	}


