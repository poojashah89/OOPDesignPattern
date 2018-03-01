package com.strategy;

public interface IfFly {
	String fly();
	
}

class cantFly implements IfFly{
	public String fly() {
		return "cant fly";
	}
}

class canFly implements IfFly{
	public String fly() {
		return "can fly";
	}
}
