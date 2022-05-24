package com.ing.zoo;

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
