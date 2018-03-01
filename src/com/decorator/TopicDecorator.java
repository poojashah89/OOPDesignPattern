package com.decorator;

public class TopicDecorator implements pizza{

	protected pizza p;
	public TopicDecorator(pizza newpizza){
		p = newpizza;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return p.getDescription();
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return p.getCost();
	}
	
	
}
