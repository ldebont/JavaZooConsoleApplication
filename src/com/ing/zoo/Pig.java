package com.ing.zoo;

import java.util.Random;

public class Pig extends Omnivore {

    public String trick;

    public Pig(String name) {
		super(name);
		greeting = "splash";
	}

    @Override
    public void eatLeaves()
    {
        System.out.println("munch munch oink");
    }

    @Override
    public void eatMeat()
    {
        System.out.println("nomnomnom oink thx");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
