package com.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
		
		this.view.addCalcListener(new CalculatorListener());
	}
	
	class CalculatorListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int fs , sn = 0;
			try{
				fs = view.getFirst();
				sn = view.getSecond();
				
				model.add(fs, sn);
				view.setSolutionText(model.getVal());
			} catch(Exception ex) {
				
			}
			
		}
		
	}
}
