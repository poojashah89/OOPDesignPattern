package com.observer;

public interface Subject {
	
	public void notifyAllObserver();
	public void register (Observer o);
	public void unregister(Observer o);
}
