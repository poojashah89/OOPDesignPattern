package com.factory;

public class mainmethod {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		 Shape shape1 = shapeFactory.getShape("CIRCLE");
		 
		 System.out.println(shape1.draw(4));
	}
}
