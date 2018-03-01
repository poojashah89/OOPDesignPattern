package com.decorator;

public class mainmthod {
	public static  void main(String[] args) {
		pizza p1 = new mozerella(new tomatosauce(new PlainPizza()));
		System.out.println(p1.getDescription()  + " " + p1.getCost());
	}
}	
