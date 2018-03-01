package com.abstractfactory;

class ShapeFactoty extends AbstractFactory{

	@Override
	color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	shape getShape(String shapeType) {
	 	
    
	    if(shapeType.equalsIgnoreCase("CIRCLE")){
	       return new Circle();
	       
	    }else if(shapeType.equalsIgnoreCase("SQUARE")){
	       return new Square();
	    }
	    
	    return null;
	}
	
}



class ColorFactoty extends AbstractFactory{

	@Override
	shape getShape(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	color getColor(String color) {
	 	
		if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("BLUE")){
	         return new BLue();
	      }
	      
	    
	    return null;
	}
	
}