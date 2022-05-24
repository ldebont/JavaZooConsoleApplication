package com.ing.zoo;

import java.util.Scanner;

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
        
        // Add animals to list
        Animal[] animals = {henk, elsa, dora, wally, marty};
                     
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        
        // All animals say hello if none are greeted by name
        if(input.equals(commands[0])) sayHelloToAll(animals);
                
        // Animal says hello if greeted by name
        for (Animal animal : animals) { 
            if (input.equals(commands[0] + " " + animal.name)) {
            	animal.sayHello();
            	break;
            }
        }
               
        // Herbivores respond if leaves are given
        for (Animal animal : animals) {
        	if (animal instanceof Herbivore) {
            	if (input.equals(commands[1])) {        		
            		((Herbivore) animal).eatLeaves();
            	}
        	}
        }
        
        // Carnivores respond if meat is given
        for (Animal animal : animals) {
        	if (animal instanceof Carnivore) {
            	if (input.equals(commands[2])) {        		
            		((Carnivore) animal).eatMeat();
            	}
        	}
        }
        
        // Omnivores respond if either meat or leaves are given
        for (Animal animal : animals) {
        	if (animal instanceof Omnivore) {
            	if (input.equals(commands[1])) {        		
            		((Omnivore) animal).eatLeaves();
            	}
            	else if (input.equals(commands[2])) {        		
            		((Omnivore) animal).eatMeat();
            	}
        	}
        }
        
        // Print error if input doesn't match any command
//        for (String command : commands) {
//        	if (!input.equals(command)) {
//                System.out.println("Unknown command: " + input);
//                break;
//        	}
//        }       
    }
         
    private static void sayHelloToAll(Animal[] animals) {   	
        for (Animal animal : animals) {
    		animal.sayHello();
        }
    }
}
