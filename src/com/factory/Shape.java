package com.factory;

public interface Shape {

	public double draw(double val);
}


class Circle implements Shape {

	@Override
	public double draw(double val) {
		// TODO Auto-generated method stub
		return val * val * 3.14;
	}
	
}


class Square implements Shape {

	@Override
	public double draw(double val) {
		// TODO Auto-generated method stub
		return val * val;
	}	
}
