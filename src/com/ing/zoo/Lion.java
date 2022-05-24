package com.ing.zoo;

public class Lion extends Carnivore {

    public Lion(String name) {
    	super(name);
    	greeting = "roooaoaaaaar";
    }

    public void eatMeat()
    {
    	super.eatMeat("nomnomnom thx mate");
    }
}
