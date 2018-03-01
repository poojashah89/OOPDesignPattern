package com.decorator;

public class tomatosauce extends TopicDecorator{

	 
	public tomatosauce(pizza newpizza){
		super(newpizza);
		
	}
	
	public String getDescription(){
		return p.getDescription() + ", adding mozerella";
	}

	public double getCost(){
		return p.getCost() + 5;
	}
}
