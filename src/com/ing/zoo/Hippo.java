package com.ing.zoo;

public class Hippo extends Herbivore {
	
    public Hippo(String name) {
		super(name);
	}
    
    public void sayHello()
    {
    	super.sayHello("splash");
    }

    public void eatLeaves()
    {
    	super.eatLeaves("munch munch lovely");
    }
}
