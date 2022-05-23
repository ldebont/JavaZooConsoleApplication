package com.ing.zoo;

public class Carnivore extends Animal {

	public Carnivore(String name) {
		super(name);
	}
	
    public void eatMeat(String eatText)
    {
        System.out.println(eatText);
    }
}
