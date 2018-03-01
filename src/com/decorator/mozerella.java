package com.decorator;

public class mozerella extends TopicDecorator{

	public mozerella(pizza newpizza) {
		super(newpizza);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescription(){
		return p.getDescription() + ", adding mozerella";
	}

	public double getCost(){
		return p.getCost() + 5;
	}
}
