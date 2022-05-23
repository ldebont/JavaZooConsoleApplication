package com.ing.zoo;

public class Herbivore extends Animal {

	public Herbivore(String name) {
		super(name);
	}

    public void eatLeaves(String eatText)
    {
        System.out.println(eatText);
    }
}
