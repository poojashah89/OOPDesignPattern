package com.observer;

public class ActualObserver implements Observer{
	String personName;

	public ActualObserver(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public void update(String availabiliy) {

		System.out.println("Hello "+personName+", Product is now "+availabiliy+" on flipkart");
	}
	
	
}
