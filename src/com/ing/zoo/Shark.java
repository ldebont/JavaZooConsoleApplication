package com.ing.zoo;

public class Shark extends Animal implements Carnivore {

	public Shark(String name) {
		super(name);
		greeting = "splash";
	}

	@Override
	public void eatMeat() 
	{
		System.out.println("Chomp chomp");
	}
}
