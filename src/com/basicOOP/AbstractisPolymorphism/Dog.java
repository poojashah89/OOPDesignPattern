package com.basicOOP.AbstractisPolymorphism;

//extend multiple extend
public class Dog extends Anima  {

	 private String name;
	 
	@Override
	public void setNme(String newname) {
		// TODO Auto-generated method stub
		name="newname";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
