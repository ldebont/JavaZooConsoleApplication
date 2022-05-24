package com.ing.zoo;

import java.util.Scanner;

import com.ing.zoo.base.Animal;
import com.ing.zoo.carnivores.Lion;
import com.ing.zoo.carnivores.Shark;
import com.ing.zoo.carnivores.Tiger;
import com.ing.zoo.herbivores.Hippo;
import com.ing.zoo.herbivores.Koala;
import com.ing.zoo.herbivores.Zebra;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Trick;
import com.ing.zoo.omnivores.Pig;

public class Zoo {		
	
    public static void main(String[] args)
    {
    	//Initialize commands
    	String[] commands = {"hello", "give leaves", "give meat", "perform trick"};
    	
    	// Initialize animals
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Shark harry = new Shark("harry");
        Koala katie = new Koala("katie");
        
        // Add animals to list
        Animal[] animals = {henk, elsa, dora, wally, marty, harry, katie};
                     
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        
        // Animal greets if greeted by name
        for (Animal animal : animals) { 
            if (input.equals(commands[0] + " " + animal.name)) {
            	animal.sayHello();
            	break;
            }
        }
        
        // All animals say hello if none are greeted by name
        if(input.equals(commands[0])) greetAll(animals);
                    
        // Herbivores respond if leaves are given
        else if(input.equals(commands[1])) feedHerbivores(animals);
                     
        // Carnivores respond if meat is given
        else if(input.equals(commands[2])) feedCarnivors(animals);

        // Animals with tricks respond if asked to perform tricks
        else if(input.equals(commands[3])) performTricks(animals);
           
        // Print error if input doesn't match any command
        //else System.out.println("Unknown command: " + input); 
        
        scanner.close();
    }
          
    private static void greetAll(Animal[] animals) {   	
        for (Animal animal : animals) {
    		animal.sayHello();
        }
    }
    
    private static void feedHerbivores(Animal[] animals) {
        for (Animal animal : animals) {
        	if (animal instanceof Herbivore) {
        		((Herbivore) animal).eatLeaves();
        	}
        }
    }
    
    private static void feedCarnivors(Animal[] animals) {
        for (Animal animal : animals) {
        	if (animal instanceof Carnivore) {
        		((Carnivore) animal).eatMeat();
        	}
        }
    }
    
    private static void performTricks(Animal[] animals) {
        for (Animal animal : animals) {
        	if (animal instanceof Trick) {
        		((Trick) animal).performTrick();
        	}
        }
    }
}
