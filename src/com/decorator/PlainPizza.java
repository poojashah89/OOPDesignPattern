package com.decorator;

public class PlainPizza implements pizza {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "plain";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 4;
	}
	
}
