package com.ing.zoo;

public class Animal {
    public String name;
    public String helloText;
    
    public Animal(String name) {
    	this.name = name;
    }
    
    public void sayHello(String helloText)
    {
        System.out.println(helloText);
    }
}