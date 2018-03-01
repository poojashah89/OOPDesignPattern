package com.basicOOP.Inheritance;

public class Animal {
	private String name;
	private int height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void eat(){
		System.out.println("EAT");
	}
}
