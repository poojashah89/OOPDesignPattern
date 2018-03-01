package com.abstractfactory;


public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		   
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactoty();
	         
	      }else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactoty();
	      }
	      
	      return null;
	   }
}
