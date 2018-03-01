package com.basicOOP.AbstractisPolymorphism;


//can be exetnded/ overridden numltiple abstracted classes

abstract public class Anima {

	//no constructor 
	
	protected String name;
	protected  String sound;
	
	//Must have abstact methods
	public abstract void setNme(String newname);
	public abstract String getName(); 
	
	//can have methods which are not abstract
	public void hifromabstract() {
		System.out.println("i am in abstract");
	}
}
