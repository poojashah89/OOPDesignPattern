package com.observer;

import java.util.ArrayList;

public class Product implements Subject{

	public ArrayList<Observer> observers = new ArrayList<Observer>();;
	private String productName;
    private String productType;
    String availability;
	
	public Product(String productName, String productType,String availability) {
		this.productName = productName;
		this.productType = productType;
		this.availability=availability;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		
		notifyAllObserver();
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	@Override
	public void notifyAllObserver() {
		for(Observer observ : observers) {
			observ.update(this.availability);
		}
		
	}

	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int index = observers.indexOf(o);
		observers.remove(index);
		
	}

}
