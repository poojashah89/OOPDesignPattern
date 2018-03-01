package com.signleton;

public class mainmethod {
	public static void main(String[] args){
		
		
		Runnable runnable = new getTiles();
		Runnable runnable1 = new getTiles();
		
		new Thread(runnable).start();

		new Thread(runnable1).start();
		
	}
}

class getTiles implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		singleton s = singleton.getInstance();
		System.out.println(s.hashCode() + " " + s.i);
		
		singleton s1 = singleton.getInstance();
		System.out.println(s.hashCode() + " " + s1.i);
		
	}
	
}