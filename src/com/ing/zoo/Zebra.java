package com.ing.zoo.herbivores;

import com.ing.zoo.base.Animal;
import com.ing.zoo.interfaces.Herbivore;

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
