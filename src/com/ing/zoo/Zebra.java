package com.ing.zoo;

public class Zebra extends Herbivore {
	
    public Zebra(String name)
    {
    	super(name);
    	greeting = "zebra zebra";
    }

    public void eatLeaves()
    {  	
    	super.eatLeaves("munch munch zank yee bra");
    }
}
