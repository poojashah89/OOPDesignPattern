package com.abstractfactory;

public interface shape {
	public double draw(double val);
	
}

class Circle implements shape {
	public double draw(double val) {
		return 3.14 * val * val;
	}
}



class Square implements shape {
	public double draw(double val) {
		return val * val;
	}
}