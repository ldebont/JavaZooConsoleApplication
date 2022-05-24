package com.ing.zoo.carnivores;

import com.ing.zoo.base.Animal;
import com.ing.zoo.interfaces.Carnivore;

public class Shark extends Animal implements Carnivore {

	public Shark(String name) {
		super(name);
		greeting = "splash";
	}

	@Override
	public void eatMeat() 
	{
		System.out.println("chomp chomp chomp");
	}
}
