package com.basicOOP.InterfacePolymorphism;

public class monkey implements Animal{

	private String name;
	
	public monkey() {
		Animal.hifrominterface();
	}
	
	
	@Override
	public void setAnimal(String setname) {
		// TODO Auto-generated method stub
		name = setname;
	}

	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		setAnimal("i m monkey");
		System.out.println(name);
		return name;
	}
}
