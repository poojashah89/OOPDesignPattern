package com.strategy;

public class Animal {

	private String name;
	 
	public IfFly flyType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	public IfFly getFlyType() {
		return flyType;
	}
	public void setFlyType(IfFly flyType) {
		this.flyType = flyType;
	}
	
	
}
