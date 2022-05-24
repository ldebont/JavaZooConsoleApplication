package com.ing.zoo;

public class Zebra extends Herbivore {
	
    public Zebra(String name)
    {
    	super(name);
    	greeting = "zebra zebra";
    }

    @Override
    public void eatLeaves()
    {  	
    	System.out.println("munch munch zank yee bra");
    }
}
