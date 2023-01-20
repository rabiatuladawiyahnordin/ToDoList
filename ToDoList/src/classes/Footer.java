package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Footer extends JPanel{
	
	JButton addTask;
	JButton clear;

	Color orange = new Color(233,133,128);
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	Footer()
	{
		this.setPreferredSize(new Dimension(400,60));
		this.setBackground(Color.lightGray);
		
		addTask = new JButton("Add Task"); //add task button
		addTask.setBorder(emptyBorder); //remove border
		addTask.setFont(new Font("Sans-serif",Font.ITALIC, 20)); //set font
		addTask.setVerticalAlignment(JButton.BOTTOM); //align text to bottom
		addTask.setBackground(orange); //set background color
		this.add(addTask); //add to footer
		
		
		this.add(Box.createHorizontalStrut(20));//Space between buttons

		clear = new JButton("Clear completed tasks"); //clear button
		clear.setFont(new Font("Sans-serif",Font.ITALIC, 20)); //set font
		clear.setBorder(emptyBorder); //remove border
		clear.setBackground(orange); //set background color
		this.add(clear); //add to footer
		
		
	}
	
	public JButton getNewTask(){
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}
}
