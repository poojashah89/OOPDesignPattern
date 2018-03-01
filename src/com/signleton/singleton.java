package com.signleton;

public class singleton {

	public static singleton fi = null;
	public int i = 0;
	boolean iftrue= true;
	private singleton() {
	}
	
	public static synchronized singleton getInstance(){
	 synchronized (singleton.class) {
		 if(fi==null) {
				fi = new singleton();
				fi.i = 6*3;
				
				Thread.currentThread();
				try{
					Thread.sleep(5000);
				} catch(Exception ex){
					
				}
			}
	}
		
		
		return fi;
	}
	
}
