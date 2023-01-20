package classes;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;


public class AppFrame extends JFrame{
	
	private TitleBar title;
	private Footer footer;
	private List list;
	
	private JButton newTask;
	private JButton clear;

	AppFrame()
	{
		this.setSize(400,600); //400 width and 600 height
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close on exit
		this.setVisible(true); //make visible
		
		title = new TitleBar();
		footer = new Footer();
		list = new List();
		
		this.add(title,BorderLayout.NORTH); //add title bar on top of the screen
		this.add(footer,BorderLayout.SOUTH); //add footer on bottom of the screen
		this.add(list,BorderLayout.CENTER); //add list in middle of footer and title
		
		newTask = footer.getNewTask();
		clear = footer.getClear();
		
		addListeners();
	}
	
	
	public void addListeners()
	{
		newTask.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				super.mouseClicked(e);
			}
		});
		newTask.addMouseListener(new MouseAdapter()
		{
			@override
			public void mousePressed(MouseEvent e)
			{
				Task task = new Task();
				list.add(task); //add new task to list
				list.updateNumbers(); //update the numbers of the tasks
				
				
				task.getDone().addMouseListener(new MouseAdapter()
				{
					@override
					public void mousePressed(MouseEvent e)
					{
						
						task.changeState(); //change color of task
						list.updateNumbers(); //updates number of tasks
						revalidate(); //update the frame
						
					}
				});
			}
			
		});
		
		
		clear.addMouseListener(new MouseAdapter()
		{
			@override
			public void mousePressed(MouseEvent e)
			{
				list.removeCompletedTasks(); //remove all completed tasks
				repaint(); //repaint the list
			}
		});
	}	
	
}
