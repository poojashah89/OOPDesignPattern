package com.observer;

public class mainmethod {
	
	public static void main(String[] args) {
		ActualObserver arpitPerson=new ActualObserver("Arpit");
		ActualObserver johnPerson=new ActualObserver("John");
	    
	    Product samsungMobile=new Product("Samsung", "Mobile", "Not available");
	    
	    //When you opt for option "Notify me when product is available".Below registerObserver method
	    //get executed   
	    samsungMobile.register(arpitPerson);
	    samsungMobile.register(johnPerson);
	    
	    //Now product is available
	    samsungMobile.setAvailability("Available");
	    
	    samsungMobile.unregister(arpitPerson);
	    samsungMobile.setAvailability("NotAvailable");
	}
}
