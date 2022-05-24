package com.ing.zoo;

public class Zebra extends Animal implements Herbivore {
	
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
