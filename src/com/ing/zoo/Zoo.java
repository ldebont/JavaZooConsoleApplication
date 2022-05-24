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
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        
        // Add animals to list
        Animal[] animals = {henk, elsa, wally, marty};
                       
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
