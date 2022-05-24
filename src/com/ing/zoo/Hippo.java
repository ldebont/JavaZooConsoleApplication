package com.ing.zoo;

public class Hippo extends Herbivore {
	
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
