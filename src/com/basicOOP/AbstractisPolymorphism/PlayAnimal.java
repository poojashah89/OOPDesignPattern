package com.basicOOP.AbstractisPolymorphism;

public class PlayAnimal {

	public static void main(String[] args){
		Dog anim = new Dog();
		anim.setNme("newname");
		System.out.println("I am a " + anim.getName());
		anim.hifromabstract();
	}
}
