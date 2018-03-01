package com.abstractfactory;

public class mainmethod {

	public static void main(String[] args) {
		 AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

	      //get an object of Shape Circle
	      shape shape1 = shapeFactory.getShape("CIRCLE");

	      //call draw method of Shape Circle
	      shape1.draw(2);
	      
	      AbstractFactory cFactory = FactoryProducer.getFactory("COLOR");

	      color color1 = cFactory.getColor("RED");
	}
}
