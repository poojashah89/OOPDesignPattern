package com.strategy;

public class Dog extends Animal {
	public Dog(){
		super();
		
		setName("I am dog");
		
		
		setFlyType(new cantFly());
		System.out.println(getFlyType().fly());
	}
}
