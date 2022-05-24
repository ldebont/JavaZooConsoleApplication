package com.ing.zoo;

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
