package com.ing.zoo;

import java.util.Random;

public class Tiger extends Carnivore {

    public String trick;

    public Tiger(String name) {
		super(name);
		greeting = "rraaarww"; 
	}

    public void eatMeat()
    {
    	super.eatMeat("nomnomnom oink wubalubadubdub");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
