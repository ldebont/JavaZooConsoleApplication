package com.ing.zoo.carnivores;

import com.ing.zoo.base.Animal;
import com.ing.zoo.interfaces.Carnivore;

public class Lion extends Animal implements Carnivore {

    public Lion(String name) {
    	super(name);
    	greeting = "roooaoaaaaar";
    }

    @Override
    public void eatMeat()
    {
    	System.out.println("nomnomnom thx mate");
    }
}
