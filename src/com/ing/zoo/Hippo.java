package com.ing.zoo;

public class Hippo extends Herbivore {
	
    public Hippo(String name) {
		super(name);
		greeting = "splash";
	}
    
    public void eatLeaves()
    {
    	super.eatLeaves("munch munch lovely");
    }
}
