package com.ing.zoo.herbivores;

import com.ing.zoo.base.Animal;
import com.ing.zoo.interfaces.Herbivore;

public class Hippo extends Animal implements Herbivore {
	
    public Hippo(String name) {
		super(name);
		greeting = "splash";
	}
    
    @Override
    public void eatLeaves()
    {
    	System.out.println("munch munch lovely");
    }
}
