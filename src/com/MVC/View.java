package com.MVC;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame{

	private JTextField first = new JTextField(20);
	private JLabel addLabel = new JLabel("+");

	private JTextField second = new JTextField(20);
	private JButton button = new JButton("Calc");
	
	private JTextField sol= new JTextField(20);
	
	View(){
		JPanel pan = new JPanel();
		pan.add(first);
		pan.add(addLabel);
		pan.add(second);
		pan.add(button);
		pan.add(sol);
		
	}
	
	public int getFirst() {
		return Integer.parseInt(first.getText());
	}
	
	public int getSecond() {
		return Integer.parseInt(second.getText());
	}
	
	public int getSolutionText(){
		return Integer.parseInt(sol.getText());
	}
	
	public void setSolutionText(int solnumber){
		sol.setText(Integer.toString(solnumber));
	}
	
	public void addCalcListener(ActionListener lstn) {
		button.addActionListener(lstn);
	}
}
