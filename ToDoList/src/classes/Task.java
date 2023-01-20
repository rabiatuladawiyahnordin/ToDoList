package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Task extends JPanel{
	
	JLabel index;
	JTextField taskName;
	JButton done;

	Color pink = new Color(255,161, 161);
	Color green = new Color(188,226,158);
	Color doneColor = new Color(233,119,119);
	
	private boolean checked;
	
	Task()
	{
		this.setPreferredSize(new Dimension(400,20));//size of task
		this.setBackground(Color.white);//set background color of task
		
		this.setLayout(new BorderLayout()); //set layout of task
		
		checked = false;
		
		index = new JLabel(""); //create index label
		index.setPreferredSize(new Dimension(20,20)); //set size of index label
		index.setHorizontalAlignment(JLabel.CENTER); //set alignment of index label
		this.add(index,BorderLayout.WEST); //add index label to task
	
		taskName = new JTextField(""); //create task name text field
		taskName.setBorder(BorderFactory.createEmptyBorder()); //remove border of text field
		taskName.setBackground(Color.white); //set background color of text field

		
		this.add(taskName,BorderLayout.CENTER);

//		JFrame done=new JFrame("Checkbox");
//		JCheckBox checkBox1 = new JCheckBox();
//		checkBox1.setBounds(100,100,50,50);
//		JCheckBox checkBox2 = new JCheckBox();
//		checkBox2.setBounds(100,150,50,50);
//		done.add(checkBox1);
//		done.add(checkBox2);
//		done.setSize(400,400);
//		done.setLayout(null);
//		done.setVisible(true);
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(80,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setBackground(doneColor);
		done.setFocusPainted(false);
		
		this.add(done,BorderLayout.EAST);
		
	}
	
	public void changeIndex(int num)
	{
		this.index.setText(num+""); //num to String
		this.revalidate(); //refresh
	}
	
	
	public JButton getDone()
	{
		return done;
	}
	
	public boolean getState()
	{
		return checked;
	}
	
	public void changeState()
	{
		this.setBackground(Color.pink);
		taskName.setBackground(Color.pink);
		checked = true;
		revalidate();
	}
}
