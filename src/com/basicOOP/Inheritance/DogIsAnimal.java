package com.basicOOP.Inheritance;

public class DogIsAnimal extends Animal{
	
	
	public DogIsAnimal(){
		super();
		setName("I am dog");
	}
	
	public void digHole() {
		System.out.println("I am digging");
	}
}
