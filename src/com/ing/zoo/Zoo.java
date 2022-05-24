package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        
        commands(henk);
    }
    
    public static void commands(Lion lion) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.equals(commands[0] + " " + lion.name))
        {
            lion.sayHello();
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
