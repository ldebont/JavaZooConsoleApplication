package com.ing.zoo.omnivores;

import java.util.Random;

import com.ing.zoo.base.Animal;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Trick;

public class Pig extends Animal implements Herbivore, Carnivore, Trick {

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

    @Override
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
