package com.tcn.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("dinoHeart")
	private Heart heart;

	@Autowired
	@Qualifier("leverObj2")
	private Lever lever;

	public Human() {}

	public Human(Heart heart) {
		System.out.println("constructor inject is executed...");
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		System.out.println("setter inject method is executed...");
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			System.out.println("Name of Animal: " + heart.getNameOfAnimal());
			System.out.println("No. of Heart:   " + heart.getNoOfHeart());
			heart.pump();
		} else {
			System.out.println("Human is dead!");
		}
	}

	public void leverStatus() {
		lever.status();
	}
}
