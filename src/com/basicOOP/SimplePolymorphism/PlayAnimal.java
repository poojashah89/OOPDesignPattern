package com.basicOOP.SimplePolymorphism;

public class PlayAnimal {

	public static void main(String[] args){
		Animal doggy = new DogIsAnimal();
		Animal cat = new CatIsAnimal();
		
		doggy.eat(); // from overloaded method
		cat.eat(); // from superclass
		
		//Type cast to access subclass's method since super class doesnt have it 
		((DogIsAnimal) doggy).digHole();
	}
}
