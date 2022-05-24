package com.ing.zoo.herbivores;

import com.ing.zoo.base.Animal;
import com.ing.zoo.interfaces.Herbivore;

public class Koala extends Animal implements Herbivore {

	public Koala(String name) {
		super(name);
		greeting = "koala koala";
	}

	@Override
	public void eatLeaves() 
	{
		System.out.println("munch munch munch");
	}
}
