package com.basicOOP.InterfacePolymorphism;

//only methods
//multiple implement
//public/static/final
//abstract by default

public interface Animal {

	public void setAnimal(String setname);
	public String getAnimal();

	//can have methods which are not abstract
		public static void hifrominterface() {
			System.out.println("i am in interface");
		}
}
