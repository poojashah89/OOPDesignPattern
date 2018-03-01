package com.basicOOP.SimplePolymorphism;

public class DogIsAnimal extends Animal{

	public DogIsAnimal(){
		super();
		
		setName("I am dog");
	}
	
	//Overloading
	public void eat(){
		System.out.println("I eat nv");
	}
	
	
	public void digHole() {
		System.out.println("I am digging");
	}
}
