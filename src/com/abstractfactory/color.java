package com.abstractfactory;

public interface color {
	void fill();
	
}


class Red implements color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Red::fill() method.");
	   }
}

class BLue implements color {

	   @Override
	   public void fill() {
	      System.out.println("Inside B::fill() method.");
	   }
}