package com.ing.zoo.base;

public class Animal {
    public String name;
    public String greeting;
    
    public Animal(String name) {
    	this.name = name;
    }
    
    public void sayHello()
    {
        System.out.println(greeting);
    }
}
